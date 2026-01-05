package p001o;

import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class dbf {

    /* renamed from: d */
    public static final x0g f19534d = x0g.m55532e(':');

    /* renamed from: e */
    public static final x0g f19535e = x0g.m55532e('*');

    /* renamed from: a */
    public final List f19536a = new ArrayList();

    /* renamed from: b */
    public int f19537b = 0;

    /* renamed from: c */
    public int f19538c;

    /* renamed from: o.dbf$a */
    public static final class C12859a {

        /* renamed from: a */
        public final int f19539a;

        /* renamed from: b */
        public final long f19540b;

        /* renamed from: c */
        public final int f19541c;

        public C12859a(int i, long j, int i2) {
            this.f19539a = i;
            this.f19540b = j;
            this.f19541c = i2;
        }
    }

    /* renamed from: b */
    public static int m22751b(String str) throws byc {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw byc.m19921a("Invalid SEF name", null);
        }
    }

    /* renamed from: f */
    public static SlowMotionData m22752f(zwc zwcVar, int i) throws byc {
        ArrayList arrayList = new ArrayList();
        List listM55535h = f19535e.m55535h(zwcVar.m60001E(i));
        for (int i2 = 0; i2 < listM55535h.size(); i2++) {
            List listM55535h2 = f19534d.m55535h((CharSequence) listM55535h.get(i2));
            if (listM55535h2.size() != 3) {
                throw byc.m19921a(null, null);
            }
            try {
                arrayList.add(new SlowMotionData.Segment(Long.parseLong((String) listM55535h2.get(0)), Long.parseLong((String) listM55535h2.get(1)), 1 << (Integer.parseInt((String) listM55535h2.get(2)) - 1)));
            } catch (NumberFormatException e) {
                throw byc.m19921a(null, e);
            }
        }
        return new SlowMotionData(arrayList);
    }

    /* renamed from: a */
    public final void m22753a(uq6 uq6Var, ued uedVar) {
        zwc zwcVar = new zwc(8);
        uq6Var.readFully(zwcVar.m60024e(), 0, 8);
        this.f19538c = zwcVar.m60040u() + 8;
        if (zwcVar.m60036q() != 1397048916) {
            uedVar.f48772a = 0L;
        } else {
            uedVar.f48772a = uq6Var.getPosition() - (this.f19538c - 12);
            this.f19537b = 2;
        }
    }

    /* renamed from: c */
    public int m22754c(uq6 uq6Var, ued uedVar, List list) throws byc {
        int i = this.f19537b;
        long j = 0;
        if (i == 0) {
            long length = uq6Var.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            uedVar.f48772a = j;
            this.f19537b = 1;
        } else if (i == 1) {
            m22753a(uq6Var, uedVar);
        } else if (i == 2) {
            m22755d(uq6Var, uedVar);
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            m22756e(uq6Var, list);
            uedVar.f48772a = 0L;
        }
        return 1;
    }

    /* renamed from: d */
    public final void m22755d(uq6 uq6Var, ued uedVar) {
        long length = uq6Var.getLength();
        int i = (this.f19538c - 12) - 8;
        zwc zwcVar = new zwc(i);
        uq6Var.readFully(zwcVar.m60024e(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            zwcVar.m60018V(2);
            short sM60042w = zwcVar.m60042w();
            if (sM60042w == 2192 || sM60042w == 2816 || sM60042w == 2817 || sM60042w == 2819 || sM60042w == 2820) {
                this.f19536a.add(new C12859a(sM60042w, (length - this.f19538c) - zwcVar.m60040u(), zwcVar.m60040u()));
            } else {
                zwcVar.m60018V(8);
            }
        }
        if (this.f19536a.isEmpty()) {
            uedVar.f48772a = 0L;
        } else {
            this.f19537b = 3;
            uedVar.f48772a = ((C12859a) this.f19536a.get(0)).f19540b;
        }
    }

    /* renamed from: e */
    public final void m22756e(uq6 uq6Var, List list) throws byc {
        long position = uq6Var.getPosition();
        int length = (int) ((uq6Var.getLength() - uq6Var.getPosition()) - this.f19538c);
        zwc zwcVar = new zwc(length);
        uq6Var.readFully(zwcVar.m60024e(), 0, length);
        for (int i = 0; i < this.f19536a.size(); i++) {
            C12859a c12859a = (C12859a) this.f19536a.get(i);
            zwcVar.m60017U((int) (c12859a.f19540b - position));
            zwcVar.m60018V(4);
            int iM60040u = zwcVar.m60040u();
            int iM22751b = m22751b(zwcVar.m60001E(iM60040u));
            int i2 = c12859a.f19541c - (iM60040u + 8);
            if (iM22751b == 2192) {
                list.add(m22752f(zwcVar, i2));
            } else if (iM22751b != 2816 && iM22751b != 2817 && iM22751b != 2819 && iM22751b != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: g */
    public void m22757g() {
        this.f19536a.clear();
        this.f19537b = 0;
    }
}
