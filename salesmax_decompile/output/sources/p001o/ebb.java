package p001o;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p001o.dbb;

/* loaded from: classes3.dex */
public class ebb implements zzc, ev7 {

    /* renamed from: d */
    public final String f21298d;

    /* renamed from: f */
    public final dbb f21300f;

    /* renamed from: a */
    public final Path f21295a = new Path();

    /* renamed from: b */
    public final Path f21296b = new Path();

    /* renamed from: c */
    public final Path f21297c = new Path();

    /* renamed from: e */
    public final List f21299e = new ArrayList();

    /* renamed from: o.ebb$a */
    public static /* synthetic */ class C13142a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21301a;

        static {
            int[] iArr = new int[dbb.EnumC12858a.values().length];
            f21301a = iArr;
            try {
                iArr[dbb.EnumC12858a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21301a[dbb.EnumC12858a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21301a[dbb.EnumC12858a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21301a[dbb.EnumC12858a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21301a[dbb.EnumC12858a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public ebb(dbb dbbVar) {
        this.f21298d = dbbVar.m22742c();
        this.f21300f = dbbVar;
    }

    /* renamed from: a */
    public final void m24701a() {
        for (int i = 0; i < this.f21299e.size(); i++) {
            this.f21297c.addPath(((zzc) this.f21299e.get(i)).getPath());
        }
    }

    @Override // p001o.j14
    /* renamed from: b */
    public void mo19334b(List list, List list2) {
        for (int i = 0; i < this.f21299e.size(); i++) {
            ((zzc) this.f21299e.get(i)).mo19334b(list, list2);
        }
    }

    /* renamed from: c */
    public final void m24702c(Path.Op op) {
        this.f21296b.reset();
        this.f21295a.reset();
        for (int size = this.f21299e.size() - 1; size >= 1; size--) {
            zzc zzcVar = (zzc) this.f21299e.get(size);
            if (zzcVar instanceof x14) {
                x14 x14Var = (x14) zzcVar;
                List listM55546i = x14Var.m55546i();
                for (int size2 = listM55546i.size() - 1; size2 >= 0; size2--) {
                    Path path = ((zzc) listM55546i.get(size2)).getPath();
                    path.transform(x14Var.m55547j());
                    this.f21296b.addPath(path);
                }
            } else {
                this.f21296b.addPath(zzcVar.getPath());
            }
        }
        zzc zzcVar2 = (zzc) this.f21299e.get(0);
        if (zzcVar2 instanceof x14) {
            x14 x14Var2 = (x14) zzcVar2;
            List listM55546i2 = x14Var2.m55546i();
            for (int i = 0; i < listM55546i2.size(); i++) {
                Path path2 = ((zzc) listM55546i2.get(i)).getPath();
                path2.transform(x14Var2.m55547j());
                this.f21295a.addPath(path2);
            }
        } else {
            this.f21295a.set(zzcVar2.getPath());
        }
        this.f21297c.op(this.f21295a, this.f21296b, op);
    }

    @Override // p001o.ev7
    /* renamed from: f */
    public void mo24703f(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            j14 j14Var = (j14) listIterator.previous();
            if (j14Var instanceof zzc) {
                this.f21299e.add((zzc) j14Var);
                listIterator.remove();
            }
        }
    }

    @Override // p001o.zzc
    public Path getPath() {
        this.f21297c.reset();
        if (this.f21300f.m22743d()) {
            return this.f21297c;
        }
        int i = C13142a.f21301a[this.f21300f.m22741b().ordinal()];
        if (i == 1) {
            m24701a();
        } else if (i == 2) {
            m24702c(Path.Op.UNION);
        } else if (i == 3) {
            m24702c(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            m24702c(Path.Op.INTERSECT);
        } else if (i == 5) {
            m24702c(Path.Op.XOR);
        }
        return this.f21297c;
    }
}
