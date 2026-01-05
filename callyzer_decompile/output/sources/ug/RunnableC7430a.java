package ug;

import e1.C1903e;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.a */
/* loaded from: classes.dex */
public final class RunnableC7430a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35234a;

    /* renamed from: b */
    public final /* synthetic */ String f35235b;

    /* renamed from: c */
    public final /* synthetic */ long f35236c;

    /* renamed from: d */
    public final /* synthetic */ c0 f35237d;

    public /* synthetic */ RunnableC7430a(c0 c0Var, String str, long j6, int i10) {
        this.f35234a = i10;
        this.f35235b = str;
        this.f35236c = j6;
        this.f35237d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35234a) {
            case 0:
                c0 c0Var = this.f35237d;
                c0Var.mo325M();
                String str = this.f35235b;
                AbstractC6840z.m13033d(str);
                C1903e c1903e = c0Var.f35306c;
                boolean zIsEmpty = c1903e.isEmpty();
                long j6 = this.f35236c;
                if (zIsEmpty) {
                    c0Var.f35307d = j6;
                }
                Integer num = (Integer) c1903e.get(str);
                if (num == null) {
                    if (c1903e.f9065c < 100) {
                        c1903e.put(str, 1);
                        c0Var.f35305b.put(str, Long.valueOf(j6));
                        break;
                    } else {
                        v0 v0Var = ((n1) c0Var.f482a).f35669f;
                        n1.m14085m(v0Var);
                        v0Var.f35865j.m14140a("Too many ads visible");
                        break;
                    }
                } else {
                    c1903e.put(str, Integer.valueOf(num.intValue() + 1));
                    break;
                }
            default:
                c0 c0Var2 = this.f35237d;
                n1 n1Var = (n1) c0Var2.f482a;
                c0Var2.mo325M();
                String str2 = this.f35235b;
                AbstractC6840z.m13033d(str2);
                C1903e c1903e2 = c0Var2.f35306c;
                Integer num2 = (Integer) c1903e2.get(str2);
                if (num2 == null) {
                    v0 v0Var2 = n1Var.f35669f;
                    n1.m14085m(v0Var2);
                    v0Var2.f35862f.m14141b(str2, "Call to endAdUnitExposure for unknown ad unit id");
                    break;
                } else {
                    b3 b3Var = n1Var.f35675m;
                    v0 v0Var3 = n1Var.f35669f;
                    n1.m14084k(b3Var);
                    x2 x2VarM13842S = b3Var.m13842S(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        c1903e2.put(str2, Integer.valueOf(iIntValue));
                        break;
                    } else {
                        c1903e2.remove(str2);
                        C1903e c1903e3 = c0Var2.f35305b;
                        Long l9 = (Long) c1903e3.get(str2);
                        long j10 = this.f35236c;
                        if (l9 == null) {
                            n1.m14085m(v0Var3);
                            v0Var3.f35862f.m14140a("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j10 - l9.longValue();
                            c1903e3.remove(str2);
                            c0Var2.m13854R(str2, jLongValue, x2VarM13842S);
                        }
                        if (c1903e2.isEmpty()) {
                            long j11 = c0Var2.f35307d;
                            if (j11 != 0) {
                                c0Var2.m13853Q(j10 - j11, x2VarM13842S);
                                c0Var2.f35307d = 0L;
                                break;
                            } else {
                                n1.m14085m(v0Var3);
                                v0Var3.f35862f.m14140a("First ad exposure time was never set");
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
