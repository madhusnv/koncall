package j$.time.format;

import j$.time.temporal.C3486p;
import j$.time.temporal.WeekFields;
import java.util.Locale;

/* renamed from: j$.time.format.r */
/* loaded from: classes2.dex */
public final class C3448r extends C3439i {

    /* renamed from: g */
    public final char f18191g;

    /* renamed from: h */
    public final int f18192h;

    @Override // j$.time.format.C3439i, j$.time.format.InterfaceC3435e
    /* renamed from: C */
    public final int mo7962C(C3451u c3451u, CharSequence charSequence, int i10) {
        return m7981f(c3451u.f18202a.f18112b).mo7962C(c3451u, charSequence, i10);
    }

    @Override // j$.time.format.C3439i, j$.time.format.InterfaceC3435e
    /* renamed from: t */
    public final boolean mo7963t(C3453w c3453w, StringBuilder sb2) {
        return m7981f(c3453w.f18212b.f18112b).mo7963t(c3453w, sb2);
    }

    public C3448r(char c2, int i10, int i11, int i12, int i13) {
        super(null, i11, i12, SignStyle.NOT_NEGATIVE, i13);
        this.f18191g = c2;
        this.f18192h = i10;
    }

    @Override // j$.time.format.C3439i
    /* renamed from: d */
    public final C3439i mo7965d() {
        if (this.f18164e == -1) {
            return this;
        }
        return new C3448r(this.f18191g, this.f18192h, this.f18161b, this.f18162c, -1);
    }

    @Override // j$.time.format.C3439i
    /* renamed from: e */
    public final C3439i mo7966e(int i10) {
        return new C3448r(this.f18191g, this.f18192h, this.f18161b, this.f18162c, this.f18164e + i10);
    }

    /* renamed from: f */
    public final C3439i m7981f(Locale locale) {
        C3486p c3486p;
        WeekFields weekFieldsOf = WeekFields.of(locale);
        char c2 = this.f18191g;
        if (c2 == 'W') {
            c3486p = weekFieldsOf.f18257d;
        } else {
            if (c2 == 'Y') {
                C3486p c3486p2 = weekFieldsOf.f18259f;
                int i10 = this.f18192h;
                if (i10 == 2) {
                    return new C3445o(c3486p2, 2, 2, C3445o.f18184h, this.f18164e);
                }
                return new C3439i(c3486p2, i10, 19, i10 < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD, this.f18164e);
            }
            if (c2 == 'c' || c2 == 'e') {
                c3486p = weekFieldsOf.f18256c;
            } else {
                if (c2 != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                c3486p = weekFieldsOf.f18258e;
            }
        }
        return new C3439i(c3486p, this.f18161b, this.f18162c, SignStyle.NOT_NEGATIVE, this.f18164e);
    }

    @Override // j$.time.format.C3439i
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("Localized(");
        int i10 = this.f18192h;
        char c2 = this.f18191g;
        if (c2 != 'Y') {
            if (c2 == 'W') {
                sb2.append("WeekOfMonth");
            } else if (c2 == 'c' || c2 == 'e') {
                sb2.append("DayOfWeek");
            } else if (c2 == 'w') {
                sb2.append("WeekOfWeekBasedYear");
            }
            sb2.append(",");
            sb2.append(i10);
        } else if (i10 == 1) {
            sb2.append("WeekBasedYear");
        } else if (i10 == 2) {
            sb2.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb2.append("WeekBasedYear,");
            sb2.append(i10);
            sb2.append(",19,");
            sb2.append(i10 < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
