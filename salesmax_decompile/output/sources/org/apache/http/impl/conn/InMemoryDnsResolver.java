package org.apache.http.impl.conn;

import java.net.InetAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.conn.DnsResolver;
import org.apache.http.util.Args;
import p001o.eja;
import p001o.sia;

/* loaded from: classes6.dex */
public class InMemoryDnsResolver implements DnsResolver {
    private final Map<String, InetAddress[]> dnsMap;
    private final sia log;

    public InMemoryDnsResolver() {
        eja.m25143k(InMemoryDnsResolver.class);
        this.dnsMap = new ConcurrentHashMap();
    }

    public void add(String str, InetAddress... inetAddressArr) {
        Args.notNull(str, "Host name");
        Args.notNull(inetAddressArr, "Array of IP addresses");
        this.dnsMap.put(str, inetAddressArr);
    }

    @Override // org.apache.http.conn.DnsResolver
    public InetAddress[] resolve(String str) {
        this.dnsMap.get(str);
        throw null;
    }
}
