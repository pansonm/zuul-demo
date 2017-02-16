package com.ebsco.demo.zuul;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import com.netflix.zuul.context.RequestContext;
import com.netflix.util.Pair;
import com.netflix.zuul.ZuulFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddResponseHeaderFilter extends ZuulFilter {

  private static Logger log = LoggerFactory.getLogger(AddResponseHeaderFilter.class);

  @Override
  public String filterType() {
    return "post";
  }

  @Override
  public int filterOrder() {
    return 1;
  }

  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() {
	// Get request context 
    RequestContext ctx = RequestContext.getCurrentContext();

    // Add a header
    List<Pair<String, String>> headers = ctx.getZuulResponseHeaders();
    Pair<String, String> pair = new Pair<>("MY_NEW_HEADER", "112312312");
    headers.add(pair);
    return null;
  }

}