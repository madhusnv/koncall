package p001o;

import com.amplifyframework.core.model.ModelIdentifier;

/* loaded from: classes6.dex */
public final class c6j {

    /* renamed from: g */
    public static final C12581a f17419g = new C12581a(null);

    /* renamed from: a */
    public final boolean f17420a;

    /* renamed from: b */
    public final Integer f17421b;

    /* renamed from: c */
    public final boolean f17422c;

    /* renamed from: d */
    public final Integer f17423d;

    /* renamed from: e */
    public final boolean f17424e;

    /* renamed from: f */
    public final boolean f17425f;

    /* renamed from: o.c6j$a */
    public static final class C12581a {
        public C12581a() {
        }

        public /* synthetic */ C12581a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final c6j m20351a(wx7 wx7Var) {
            sq8.m48649h(wx7Var, "responseHeaders");
            int size = wx7Var.size();
            boolean z = false;
            Integer numM22638l = null;
            boolean z2 = false;
            Integer numM22638l2 = null;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < size; i++) {
                if (e9g.m24606x(wx7Var.m55329j(i), "Sec-WebSocket-Extensions", true)) {
                    String strM55333w = wx7Var.m55333w(i);
                    int i2 = 0;
                    while (i2 < strM55333w.length()) {
                        int iM28630j = ggj.m28630j(strM55333w, ',', i2, 0, 4, null);
                        int iM28628h = ggj.m28628h(strM55333w, ';', i2, iM28630j);
                        String strM28617F = ggj.m28617F(strM55333w, i2, iM28628h);
                        int i3 = iM28628h + 1;
                        if (e9g.m24606x(strM28617F, "permessage-deflate", true)) {
                            if (z) {
                                z4 = true;
                            }
                            i2 = i3;
                            while (i2 < iM28630j) {
                                int iM28628h2 = ggj.m28628h(strM55333w, ';', i2, iM28630j);
                                int iM28628h3 = ggj.m28628h(strM55333w, '=', i2, iM28628h2);
                                String strM28617F2 = ggj.m28617F(strM55333w, i2, iM28628h3);
                                String strW0 = iM28628h3 < iM28628h2 ? f9g.w0(ggj.m28617F(strM55333w, iM28628h3 + 1, iM28628h2), ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR) : null;
                                i2 = iM28628h2 + 1;
                                if (e9g.m24606x(strM28617F2, "client_max_window_bits", true)) {
                                    if (numM22638l != null) {
                                        z4 = true;
                                    }
                                    numM22638l = strW0 != null ? d9g.m22638l(strW0) : null;
                                    if (numM22638l == null) {
                                        z4 = true;
                                    }
                                } else if (e9g.m24606x(strM28617F2, "client_no_context_takeover", true)) {
                                    if (z2) {
                                        z4 = true;
                                    }
                                    if (strW0 != null) {
                                        z4 = true;
                                    }
                                    z2 = true;
                                } else if (e9g.m24606x(strM28617F2, "server_max_window_bits", true)) {
                                    if (numM22638l2 != null) {
                                        z4 = true;
                                    }
                                    numM22638l2 = strW0 != null ? d9g.m22638l(strW0) : null;
                                    if (numM22638l2 == null) {
                                        z4 = true;
                                    }
                                } else if (e9g.m24606x(strM28617F2, "server_no_context_takeover", true)) {
                                    if (z3) {
                                        z4 = true;
                                    }
                                    if (strW0 != null) {
                                        z4 = true;
                                    }
                                    z3 = true;
                                } else {
                                    z4 = true;
                                }
                            }
                            z = true;
                        } else {
                            i2 = i3;
                            z4 = true;
                        }
                    }
                }
            }
            return new c6j(z, numM22638l, z2, numM22638l2, z3, z4);
        }
    }

    public c6j(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.f17420a = z;
        this.f17421b = num;
        this.f17422c = z2;
        this.f17423d = num2;
        this.f17424e = z3;
        this.f17425f = z4;
    }

    /* renamed from: a */
    public final boolean m20350a(boolean z) {
        return z ? this.f17422c : this.f17424e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6j)) {
            return false;
        }
        c6j c6jVar = (c6j) obj;
        return this.f17420a == c6jVar.f17420a && sq8.m48644c(this.f17421b, c6jVar.f17421b) && this.f17422c == c6jVar.f17422c && sq8.m48644c(this.f17423d, c6jVar.f17423d) && this.f17424e == c6jVar.f17424e && this.f17425f == c6jVar.f17425f;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f17420a) * 31;
        Integer num = this.f17421b;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f17422c)) * 31;
        Integer num2 = this.f17423d;
        return ((((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f17424e)) * 31) + Boolean.hashCode(this.f17425f);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f17420a + ", clientMaxWindowBits=" + this.f17421b + ", clientNoContextTakeover=" + this.f17422c + ", serverMaxWindowBits=" + this.f17423d + ", serverNoContextTakeover=" + this.f17424e + ", unknownValues=" + this.f17425f + ')';
    }
}
