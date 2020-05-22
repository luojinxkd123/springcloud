package org.luojin.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

/**
 * @author:luojin
 * @apiNote:
 * @since: 2020-05-22 12:43
 */
public class AccessFilter extends ZuulFilter {

    public String filterType() {
        return null;
    }

    public int filterOrder() {
        return 0;
    }

    public boolean shouldFilter() {
        return false;
    }

    public Object run() throws ZuulException {
        return null;
    }
}
