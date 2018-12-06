package com.nantian.demo.controller;

import com.nantian.demo.domain.Product;
import com.nantian.demo.service.ProductService;
import com.nantian.demo.utils.UUIdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	/**
	 * 请求添加页面
	 * @return
	 */
	@RequestMapping("/addForm")
	public String addForm() {
		return "addProduct";
	}

	/**
	 * 添加商品方法
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/add")
	public Product add(Product product) {
		product.setId(UUIdUtils.next());
		productService.add(product);
		return productService.findById(product.getId());
	}

	@ResponseBody
	@RequestMapping("/findAll")
	public List<Product> findAll() {
		return productService.findAll();
	}

	@RequestMapping("/list")
	public String list(Model model) {
		List<Product> list = productService.findAll();
		model.addAttribute("list", list);
		return "productList";
	}

	@RequestMapping("/purchase")
	public String purchase(String id, Model model) {
		Product product = productService.findById(id);
		model.addAttribute("product", product);
		return "productPurchase";
	}

}
