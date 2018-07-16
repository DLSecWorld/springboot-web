package com.tdworld.context.datasource.readwritesplit;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class RoutingDataSourceImpl extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		return ThreadDBHolder.get();
	}

}
