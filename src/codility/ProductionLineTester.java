package com.codility;

import java.util.stream.Stream;
import java.util.concurrent.atomic.AtomicLong;

class ProductionLineTester {

  private final ProductVerifier verifier;

  ProductionLineTester(ProductVerifier verifier) {
    this.verifier = verifier;
  }

  ProductLineTestReport test(Stream<Product> products) {
	    AtomicLong correctCounter = new AtomicLong(0L);
	    AtomicLong checkedExcCounter = new AtomicLong(0L);
	    AtomicLong uncheckedExcCounter = new AtomicLong(0L);
	    AtomicLong otherExcCounter = new AtomicLong(0L);

    if (products != null) {
        products
              .filter(product -> product != null)
              .filter(product -> product.getStatus() != null && !product.getStatus().toLowerCase().equals("invalid"))
              .skip(10)
              .limit(20)
  				  	.forEach(product -> {
			                try {
			                      verifier.verify(product);
			                      correctCounter.incrementAndGet();
			                } catch(RuntimeException runtimeException) {
			                	    uncheckedExcCounter.incrementAndGet();
			                } catch(Error runtimeException) {
			                	    otherExcCounter.incrementAndGet();
			                } catch(Exception otherException) {
                          if (otherException instanceof Throwable)
                            checkedExcCounter.incrementAndGet();
                          else
                            uncheckedExcCounter.incrementAndGet();
			                }
				  	});
    }
    
    return	new ProductLineTestReport(correctCounter.longValue(),checkedExcCounter.longValue(), uncheckedExcCounter.longValue(),otherExcCounter.longValue());

  }

}