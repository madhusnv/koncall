package p001o;

import androidx.media3.common.C2181a;

/* loaded from: classes2.dex */
public interface hdb {

    /* renamed from: a */
    public static final hdb f26683a = new C13918a();

    /* renamed from: o.hdb$a */
    public class C13918a implements hdb {
        @Override // p001o.hdb
        /* renamed from: a */
        public boolean mo30258a(C2181a c2181a) {
            String str = c2181a.f7943n;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // p001o.hdb
        /* renamed from: b */
        public gdb mo30259b(C2181a c2181a) {
            String str = c2181a.f7943n;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new km0();
                    case "application/x-icy":
                        return new sa8();
                    case "application/id3":
                        return new ua8();
                    case "application/x-emsg":
                        return new jk6();
                    case "application/x-scte35":
                        return new u0g();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    /* renamed from: a */
    boolean mo30258a(C2181a c2181a);

    /* renamed from: b */
    gdb mo30259b(C2181a c2181a);
}
