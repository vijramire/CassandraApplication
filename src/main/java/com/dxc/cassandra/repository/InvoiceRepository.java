package com.dxc.cassandra.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.dxc.cassandra.pojo.Invoice;

public interface InvoiceRepository extends CassandraRepository<Invoice, Integer>{

	List<Invoice> findByShopname(String name);

	@AllowFiltering//remove annotation to verify that it will not execute for UnIndexed column.
	List<Invoice> findByItemname(String itemname);

	@AllowFiltering
	List<Invoice> findByItemnameAndShopname(String Itemname, String shopname );
}
