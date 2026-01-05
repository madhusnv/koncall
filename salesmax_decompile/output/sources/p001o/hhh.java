package p001o;

import org.apache.http.message.TokenParser;

/* loaded from: classes4.dex */
public abstract class hhh {

    /* renamed from: o.hhh$a */
    public class C13972a implements InterfaceC13973b {

        /* renamed from: a */
        public final /* synthetic */ yq1 f27002a;

        public C13972a(yq1 yq1Var) {
            this.f27002a = yq1Var;
        }

        @Override // p001o.hhh.InterfaceC13973b
        /* renamed from: a */
        public byte mo30607a(int i) {
            return this.f27002a.mo58092d(i);
        }

        @Override // p001o.hhh.InterfaceC13973b
        public int size() {
            return this.f27002a.size();
        }
    }

    /* renamed from: o.hhh$b */
    public interface InterfaceC13973b {
        /* renamed from: a */
        byte mo30607a(int i);

        int size();
    }

    /* renamed from: a */
    public static String m30604a(yq1 yq1Var) {
        return m30605b(new C13972a(yq1Var));
    }

    /* renamed from: b */
    public static String m30605b(InterfaceC13973b interfaceC13973b) {
        StringBuilder sb = new StringBuilder(interfaceC13973b.size());
        for (int i = 0; i < interfaceC13973b.size(); i++) {
            byte bMo30607a = interfaceC13973b.mo30607a(i);
            if (bMo30607a == 34) {
                sb.append("\\\"");
            } else if (bMo30607a == 39) {
                sb.append("\\'");
            } else if (bMo30607a != 92) {
                switch (bMo30607a) {
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
                        if (bMo30607a < 32 || bMo30607a > 126) {
                            sb.append(TokenParser.ESCAPE);
                            sb.append((char) (((bMo30607a >>> 6) & 3) + 48));
                            sb.append((char) (((bMo30607a >>> 3) & 7) + 48));
                            sb.append((char) ((bMo30607a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bMo30607a);
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
    public static String m30606c(String str) {
        return m30604a(yq1.m58082m(str));
    }
}
