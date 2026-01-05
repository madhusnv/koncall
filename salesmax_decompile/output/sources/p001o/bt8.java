package p001o;

import java.io.IOException;

/* loaded from: classes4.dex */
public class bt8 extends IOException {

    /* renamed from: a */
    public rcb f16782a;

    /* renamed from: o.bt8$a */
    public static class C12491a extends bt8 {
        public C12491a(String str) {
            super(str);
        }
    }

    public bt8(String str) {
        super(str);
        this.f16782a = null;
    }

    /* renamed from: a */
    public static bt8 m19716a() {
        return new bt8("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: b */
    public static bt8 m19717b() {
        return new bt8("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static bt8 m19718c() {
        return new bt8("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    public static C12491a m19719d() {
        return new C12491a("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    public static bt8 m19720e() {
        return new bt8("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    public static bt8 m19721f() {
        return new bt8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    public static bt8 m19722g() {
        return new bt8("Failed to parse the message.");
    }

    /* renamed from: h */
    public static bt8 m19723h() {
        return new bt8("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: j */
    public static bt8 m19724j() {
        return new bt8("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: i */
    public bt8 m19725i(rcb rcbVar) {
        this.f16782a = rcbVar;
        return this;
    }
}
