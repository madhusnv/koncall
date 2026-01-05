package jakarta.mail;

import java.net.InetAddress;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.b */
/* loaded from: classes3.dex */
public abstract class AbstractC3634b {
    private int requestingPort;
    private String requestingPrompt;
    private String requestingProtocol;
    private InetAddress requestingSite;
    private String requestingUserName;

    public final String getDefaultUserName() {
        return this.requestingUserName;
    }

    public abstract C3686r getPasswordAuthentication();

    public final int getRequestingPort() {
        return this.requestingPort;
    }

    public final String getRequestingPrompt() {
        return this.requestingPrompt;
    }

    public final String getRequestingProtocol() {
        return this.requestingProtocol;
    }

    public final InetAddress getRequestingSite() {
        return this.requestingSite;
    }

    public final synchronized C3686r requestPasswordAuthentication(InetAddress inetAddress, int i10, String str, String str2, String str3) {
        this.requestingSite = inetAddress;
        this.requestingPort = i10;
        this.requestingProtocol = str;
        this.requestingPrompt = str2;
        this.requestingUserName = str3;
        return getPasswordAuthentication();
    }
}
