package jakarta.mail;

import com.sun.mail.util.AbstractC1452a;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jakarta.mail.t */
/* loaded from: classes3.dex */
public class C3688t {
    private String className;
    private String protocol;
    private C3687s type;
    private String vendor;
    private String version;

    public C3688t(C3687s c3687s, String str, String str2, String str3, String str4) {
        this.type = c3687s;
        this.protocol = str;
        this.className = str2;
        this.vendor = str3;
        this.version = str4;
    }

    public String getClassName() {
        return this.className;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public C3687s getType() {
        return this.type;
    }

    public String getVendor() {
        return this.vendor;
    }

    public String getVersion() {
        return this.version;
    }

    public String toString() {
        String string = "jakarta.mail.Provider[" + this.type + "," + this.protocol + "," + this.className;
        if (this.vendor != null) {
            StringBuilder sbM11245p = AbstractC5601a.m11245p(string, ",");
            sbM11245p.append(this.vendor);
            string = sbM11245p.toString();
        }
        if (this.version != null) {
            StringBuilder sbM11245p2 = AbstractC5601a.m11245p(string, ",");
            sbM11245p2.append(this.version);
            string = sbM11245p2.toString();
        }
        return AbstractC1452a.m4561h(string, "]");
    }
}
