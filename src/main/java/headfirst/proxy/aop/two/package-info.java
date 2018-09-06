package headfirst.proxy.aop.two;

/**
 * 1的问题就是只对Ihello接口的sayhello()监控了，还是不够
 * 但是如果每个方法都监控，照上面的方法就太麻烦了。
 *
 * 按照保护代理的感觉写，不过保护道理会判断类型，这个里面暂时不用判断，所以
 * PersonProxyIntegration的方法可以和InvocationHandler具体实现的方法写到一个动态代理类中，直接用this就可以了
 *
 */