package org.zappos.giftideas.optimalselection;

import java.util.List;

import org.zappos.giftideas.optimalselection.entity.Product;

/**
 * Interface to define API calls to be made to zappos.
 * 
 * @author naynish
 * 
 */
public interface ZapposAPIHandler {

	public List<Product> search(double price, int pageNumber) throws Exception;
}
