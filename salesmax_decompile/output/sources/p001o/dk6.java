package p001o;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class dk6 {
    public static final C12979b Companion = new C12979b(null);
    public static final dk6 NONE = new C12978a();

    /* renamed from: o.dk6$a */
    public static final class C12978a extends dk6 {
    }

    /* renamed from: o.dk6$b */
    public static final class C12979b {
        public C12979b() {
        }

        public /* synthetic */ C12979b(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.dk6$c */
    public interface InterfaceC12980c {
        /* renamed from: a */
        dk6 mo23359a(bt1 bt1Var);
    }

    public void cacheConditionalHit(bt1 bt1Var, zqe zqeVar) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(zqeVar, "cachedResponse");
    }

    public void cacheHit(bt1 bt1Var, zqe zqeVar) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(zqeVar, "response");
    }

    public void cacheMiss(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
    }

    public void callEnd(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
    }

    public void callFailed(bt1 bt1Var, IOException iOException) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(iOException, "ioe");
    }

    public void callStart(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
    }

    public void canceled(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
    }

    public void connectEnd(bt1 bt1Var, InetSocketAddress inetSocketAddress, Proxy proxy, a2e a2eVar) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(inetSocketAddress, "inetSocketAddress");
        sq8.m48649h(proxy, "proxy");
    }

    public void connectFailed(bt1 bt1Var, InetSocketAddress inetSocketAddress, Proxy proxy, a2e a2eVar, IOException iOException) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(inetSocketAddress, "inetSocketAddress");
        sq8.m48649h(proxy, "proxy");
        sq8.m48649h(iOException, "ioe");
    }

    public void connectStart(bt1 bt1Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(inetSocketAddress, "inetSocketAddress");
        sq8.m48649h(proxy, "proxy");
    }

    public void connectionAcquired(bt1 bt1Var, xr3 xr3Var) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(xr3Var, "connection");
    }

    public void connectionReleased(bt1 bt1Var, xr3 xr3Var) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(xr3Var, "connection");
    }

    public void dnsEnd(bt1 bt1Var, String str, List<InetAddress> list) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(str, "domainName");
        sq8.m48649h(list, "inetAddressList");
    }

    public void dnsStart(bt1 bt1Var, String str) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(str, "domainName");
    }

    public void proxySelectEnd(bt1 bt1Var, w48 w48Var, List<Proxy> list) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(w48Var, ImagesContract.URL);
        sq8.m48649h(list, "proxies");
    }

    public void proxySelectStart(bt1 bt1Var, w48 w48Var) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(w48Var, ImagesContract.URL);
    }

    public void requestBodyEnd(bt1 bt1Var, long j) {
        sq8.m48649h(bt1Var, "call");
    }

    public void requestBodyStart(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
    }

    public void requestFailed(bt1 bt1Var, IOException iOException) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(iOException, "ioe");
    }

    public void requestHeadersEnd(bt1 bt1Var, ule uleVar) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(uleVar, "request");
    }

    public void requestHeadersStart(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
    }

    public void responseBodyEnd(bt1 bt1Var, long j) {
        sq8.m48649h(bt1Var, "call");
    }

    public void responseBodyStart(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
    }

    public void responseFailed(bt1 bt1Var, IOException iOException) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(iOException, "ioe");
    }

    public void responseHeadersEnd(bt1 bt1Var, zqe zqeVar) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(zqeVar, "response");
    }

    public void responseHeadersStart(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
    }

    public void satisfactionFailure(bt1 bt1Var, zqe zqeVar) {
        sq8.m48649h(bt1Var, "call");
        sq8.m48649h(zqeVar, "response");
    }

    public void secureConnectEnd(bt1 bt1Var, ww7 ww7Var) {
        sq8.m48649h(bt1Var, "call");
    }

    public void secureConnectStart(bt1 bt1Var) {
        sq8.m48649h(bt1Var, "call");
    }
}
