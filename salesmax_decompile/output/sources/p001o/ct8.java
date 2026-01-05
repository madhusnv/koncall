package p001o;

import java.io.IOException;

/* loaded from: classes6.dex */
public class ct8 extends IOException {

    /* renamed from: a */
    public scb f18613a;

    /* renamed from: b */
    public boolean f18614b;

    /* renamed from: o.ct8$a */
    public static class C12741a extends ct8 {
        public C12741a(String str) {
            super(str);
        }
    }

    public ct8(String str) {
        super(str);
        this.f18613a = null;
    }

    /* renamed from: b */
    public static ct8 m21764b() {
        return new ct8("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    public static ct8 m21765c() {
        return new ct8("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    public static ct8 m21766d() {
        return new ct8("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    public static C12741a m21767e() {
        return new C12741a("Protocol message tag had invalid wire type.");
    }

    /* renamed from: f */
    public static ct8 m21768f() {
        return new ct8("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: g */
    public static ct8 m21769g() {
        return new ct8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: h */
    public static ct8 m21770h() {
        return new ct8("Failed to parse the message.");
    }

    /* renamed from: i */
    public static ct8 m21771i() {
        return new ct8("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: l */
    public static ct8 m21772l() {
        return new ct8("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: m */
    public static ct8 m21773m() {
        return new ct8("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: a */
    public boolean m21774a() {
        return this.f18614b;
    }

    /* renamed from: j */
    public void m21775j() {
        this.f18614b = true;
    }

    /* renamed from: k */
    public ct8 m21776k(scb scbVar) {
        this.f18613a = scbVar;
        return this;
    }

    public ct8(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f18613a = null;
    }
}
