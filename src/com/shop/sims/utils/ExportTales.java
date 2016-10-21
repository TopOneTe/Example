package com.shop.sims.utils;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class ExportTales {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SchemaExport s = new SchemaExport(cfg);
		s.create(true, true);
	}
}
