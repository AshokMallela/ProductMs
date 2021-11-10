package com.infosys.infytel.product.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infosys.infytel.product.dto.ProductDTO;
import com.infosys.infytel.product.dto.SubscribedProductDTO;
import com.infosys.infytel.product.entity.Product;
import com.infosys.infytel.product.entity.SubscribedProduct;
import com.infosys.infytel.product.repository.ProductRepository;
import com.infosys.infytel.product.repository.ProductRepository2;

@Service
public class ProductService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProductRepository2 productRepo2;
	@Autowired
	ProductRepository productRepo;

	public List<SubscribedProductDTO> getAllProduct() {
		List<SubscribedProduct> products = productRepo2.findAll();
		List<SubscribedProductDTO> subproDTOs = new ArrayList<SubscribedProductDTO>();
		logger.info("All product details : {}", products);
		for(SubscribedProduct product : products) {
			SubscribedProductDTO subproDTO = SubscribedProductDTO.valueOf(product);
			subproDTOs.add(subproDTO);
		}

		logger.info("product details : {}", subproDTOs);
		return subproDTOs;
	}
	
	public String addProduct(@Valid ProductDTO productDTO) throws Exception {
		Product product=productRepo.findById(productDTO.getProdId()).orElse(null);
		logger.info("add product request for buyerid {} with buyerid {}", productDTO.getProdId(), product);
		if(product!=null)
			throw new Exception("Product Already exist...");
		Product newbuyer = productDTO.createEntity();
		productRepo.save(newbuyer);
		logger.info("added success");
		return "Product Added Successfully";
	}

	public String deletProduct(String prodId) throws Exception {
		Product product=productRepo.findById(prodId).orElse(null);
		if(product==null)
			throw new Exception("Product does not exist");
		productRepo.deleteById(prodId);
		return "product deleted successfully";
	}

	public String getProductStock(String buyerId) {
		Product product = productRepo.findById(buyerId).orElse(null);
		return Integer.toString(product.getStock());
	}

	public String getSellerId(String prodId) throws Exception {
		Product product = productRepo.findById(prodId).orElse(null);
		if(product==null)
			throw new Exception("Product does Not Exsist..");
		return product.getSellerId();
	}

	public List<ProductDTO> getAllProduct2(String category) throws Exception{
		List<Product> products = productRepo.findAll();
		List<ProductDTO> subproDTOs = new ArrayList<ProductDTO>();
		for(Product product : products) {
			ProductDTO subproDTO = ProductDTO.valueOf(product);
			if(subproDTO.getCategory().equals(category))
				subproDTOs.add(subproDTO);
		}

		logger.info("product details : {}", subproDTOs);
		if(subproDTOs.isEmpty())
			throw new Exception("Product does Not Exsist on this category..");
		return subproDTOs;
	}

	public List<ProductDTO> getAllProduct3(String name) throws Exception{
		List<Product> products = productRepo.findAll();
		List<ProductDTO> subproDTOs = new ArrayList<ProductDTO>();
		for(Product product : products) {
			ProductDTO subproDTO = ProductDTO.valueOf(product);
			if(subproDTO.getCategory().equals(name))
				subproDTOs.add(subproDTO);
		}

		logger.info("product details : {}", subproDTOs);
		if(subproDTOs.isEmpty())
			throw new Exception("Product does Not Exsist on this category..");
		return subproDTOs;
	}

	public List<ProductDTO> getAllProducts()
	{
		List<Product> products=productRepo.findAll();
		List<ProductDTO> dtos=new ArrayList<ProductDTO>();
		for(Product product:products)
		{
			ProductDTO productDTO=ProductDTO.valueOf(product);
			dtos.add(productDTO);
		}
		return dtos;
	}
}
