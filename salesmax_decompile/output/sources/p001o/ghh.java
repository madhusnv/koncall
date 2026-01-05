package p001o;

import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public abstract class ghh {

    /* renamed from: o.ghh$a */
    public static class C13724a implements InterfaceC13725b {

        /* renamed from: a */
        public final /* synthetic */ xq1 f25230a;

        public C13724a(xq1 xq1Var) {
            this.f25230a = xq1Var;
        }

        @Override // p001o.ghh.InterfaceC13725b
        /* renamed from: a */
        public byte mo28727a(int i) {
            return this.f25230a.mo53611e(i);
        }

        @Override // p001o.ghh.InterfaceC13725b
        public int size() {
            return this.f25230a.size();
        }
    }

    /* renamed from: o.ghh$b */
    public interface InterfaceC13725b {
        /* renamed from: a */
        byte mo28727a(int i);

        int size();
    }

    /* renamed from: a */
    public static String m28724a(xq1 xq1Var) {
        return m28725b(new C13724a(xq1Var));
    }

    /* renamed from: b */
    public static String m28725b(InterfaceC13725b interfaceC13725b) {
        StringBuilder sb = new StringBuilder(interfaceC13725b.size());
        for (int i = 0; i < interfaceC13725b.size(); i++) {
            byte bMo28727a = interfaceC13725b.mo28727a(i);
            if (bMo28727a == 34) {
                sb.append("\\\"");
            } else if (bMo28727a == 39) {
                sb.append("\\'");
            } else if (bMo28727a != 92) {
                switch (bMo28727a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo28727a < 32 || bMo28727a > 126) {
                            sb.append(TokenParser.ESCAPE);
                            sb.append((char) (((bMo28727a >>> 6) & 3) + 48));
                            sb.append((char) (((bMo28727a >>> 3) & 7) + 48));
                            sb.append((char) ((bMo28727a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bMo28727a);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m28726c(String str) {
        return m28724a(xq1.m56589q(str));
    }
}
