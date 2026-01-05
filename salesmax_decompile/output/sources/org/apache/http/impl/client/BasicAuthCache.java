package org.apache.http.impl.client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthScheme;
import org.apache.http.client.AuthCache;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.UnsupportedSchemeException;
import org.apache.http.impl.conn.DefaultSchemePortResolver;
import org.apache.http.util.Args;
import p001o.eja;
import p001o.sia;

@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes6.dex */
public class BasicAuthCache implements AuthCache {
    private final sia log;
    private final Map<HttpHost, byte[]> map;
    private final SchemePortResolver schemePortResolver;

    public BasicAuthCache(SchemePortResolver schemePortResolver) {
        eja.m25143k(getClass());
        this.map = new ConcurrentHashMap();
        this.schemePortResolver = schemePortResolver == null ? DefaultSchemePortResolver.INSTANCE : schemePortResolver;
    }

    @Override // org.apache.http.client.AuthCache
    public void clear() {
        this.map.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        throw null;
     */
    @Override // org.apache.http.client.AuthCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AuthScheme get(HttpHost httpHost) throws IOException {
        Args.notNull(httpHost, "HTTP host");
        byte[] bArr = this.map.get(getKey(httpHost));
        if (bArr == null) {
            return null;
        }
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
            AuthScheme authScheme = (AuthScheme) objectInputStream.readObject();
            objectInputStream.close();
            return authScheme;
        } catch (IOException unused) {
            throw null;
        } catch (ClassNotFoundException unused2) {
            throw null;
        }
    }

    public HttpHost getKey(HttpHost httpHost) {
        if (httpHost.getPort() <= 0) {
            try {
                return new HttpHost(httpHost.getHostName(), this.schemePortResolver.resolve(httpHost), httpHost.getSchemeName());
            } catch (UnsupportedSchemeException unused) {
            }
        }
        return httpHost;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        throw null;
     */
    @Override // org.apache.http.client.AuthCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void put(HttpHost httpHost, AuthScheme authScheme) throws IOException {
        Args.notNull(httpHost, "HTTP host");
        if (authScheme == null) {
            return;
        }
        if (!(authScheme instanceof Serializable)) {
            throw null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(authScheme);
            objectOutputStream.close();
            this.map.put(getKey(httpHost), byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw null;
        }
    }

    @Override // org.apache.http.client.AuthCache
    public void remove(HttpHost httpHost) {
        Args.notNull(httpHost, "HTTP host");
        this.map.remove(getKey(httpHost));
    }

    public String toString() {
        return this.map.toString();
    }

    public BasicAuthCache() {
        this(null);
    }
}
