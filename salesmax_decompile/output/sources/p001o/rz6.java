package p001o;

import com.google.android.gms.common.api.Api;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class rz6 implements ief {

    /* renamed from: a */
    public final File f44311a;

    /* renamed from: b */
    public final vz6 f44312b;

    /* renamed from: c */
    public final xk7 f44313c;

    /* renamed from: d */
    public final xk7 f44314d;

    /* renamed from: e */
    public final nl7 f44315e;

    /* renamed from: f */
    public final int f44316f;

    /* renamed from: o.rz6$a */
    public static abstract class AbstractC16688a extends AbstractC16690c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC16688a(File file) {
            super(file);
            sq8.m48649h(file, "rootDir");
        }
    }

    /* renamed from: o.rz6$b */
    public final class C16689b extends z7 {

        /* renamed from: c */
        public final ArrayDeque f44317c;

        /* renamed from: o.rz6$b$a */
        public final class a extends AbstractC16688a {

            /* renamed from: b */
            public boolean f44319b;

            /* renamed from: c */
            public File[] f44320c;

            /* renamed from: d */
            public int f44321d;

            /* renamed from: e */
            public boolean f44322e;

            /* renamed from: f */
            public final /* synthetic */ C16689b f44323f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C16689b c16689b, File file) {
                super(file);
                sq8.m48649h(file, "rootDir");
                this.f44323f = c16689b;
            }

            @Override // p001o.rz6.AbstractC16690c
            /* renamed from: b */
            public File mo47352b() {
                if (!this.f44322e && this.f44320c == null) {
                    xk7 xk7Var = rz6.this.f44313c;
                    boolean z = false;
                    if (xk7Var != null && !((Boolean) xk7Var.invoke(m47353a())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    File[] fileArrListFiles = m47353a().listFiles();
                    this.f44320c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        nl7 nl7Var = rz6.this.f44315e;
                        if (nl7Var != null) {
                            nl7Var.invoke(m47353a(), new na(m47353a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f44322e = true;
                    }
                }
                File[] fileArr = this.f44320c;
                if (fileArr != null) {
                    int i = this.f44321d;
                    sq8.m48646e(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f44320c;
                        sq8.m48646e(fileArr2);
                        int i2 = this.f44321d;
                        this.f44321d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f44319b) {
                    this.f44319b = true;
                    return m47353a();
                }
                xk7 xk7Var2 = rz6.this.f44314d;
                if (xk7Var2 != null) {
                    xk7Var2.invoke(m47353a());
                }
                return null;
            }
        }

        /* renamed from: o.rz6$b$b */
        public final class b extends AbstractC16690c {

            /* renamed from: b */
            public boolean f44324b;

            /* renamed from: c */
            public final /* synthetic */ C16689b f44325c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C16689b c16689b, File file) {
                super(file);
                sq8.m48649h(file, "rootFile");
                this.f44325c = c16689b;
            }

            @Override // p001o.rz6.AbstractC16690c
            /* renamed from: b */
            public File mo47352b() {
                if (this.f44324b) {
                    return null;
                }
                this.f44324b = true;
                return m47353a();
            }
        }

        /* renamed from: o.rz6$b$c */
        public final class c extends AbstractC16688a {

            /* renamed from: b */
            public boolean f44326b;

            /* renamed from: c */
            public File[] f44327c;

            /* renamed from: d */
            public int f44328d;

            /* renamed from: e */
            public final /* synthetic */ C16689b f44329e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C16689b c16689b, File file) {
                super(file);
                sq8.m48649h(file, "rootDir");
                this.f44329e = c16689b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
            
                if (r0.length == 0) goto L33;
             */
            @Override // p001o.rz6.AbstractC16690c
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public File mo47352b() {
                nl7 nl7Var;
                if (!this.f44326b) {
                    xk7 xk7Var = rz6.this.f44313c;
                    boolean z = false;
                    if (xk7Var != null && !((Boolean) xk7Var.invoke(m47353a())).booleanValue()) {
                        z = true;
                    }
                    if (z) {
                        return null;
                    }
                    this.f44326b = true;
                    return m47353a();
                }
                File[] fileArr = this.f44327c;
                if (fileArr != null) {
                    int i = this.f44328d;
                    sq8.m48646e(fileArr);
                    if (i >= fileArr.length) {
                        xk7 xk7Var2 = rz6.this.f44314d;
                        if (xk7Var2 != null) {
                            xk7Var2.invoke(m47353a());
                        }
                        return null;
                    }
                }
                if (this.f44327c == null) {
                    File[] fileArrListFiles = m47353a().listFiles();
                    this.f44327c = fileArrListFiles;
                    if (fileArrListFiles == null && (nl7Var = rz6.this.f44315e) != null) {
                        nl7Var.invoke(m47353a(), new na(m47353a(), null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.f44327c;
                    if (fileArr2 != null) {
                        sq8.m48646e(fileArr2);
                    }
                    xk7 xk7Var3 = rz6.this.f44314d;
                    if (xk7Var3 != null) {
                        xk7Var3.invoke(m47353a());
                    }
                    return null;
                }
                File[] fileArr3 = this.f44327c;
                sq8.m48646e(fileArr3);
                int i2 = this.f44328d;
                this.f44328d = i2 + 1;
                return fileArr3[i2];
            }
        }

        /* renamed from: o.rz6$b$d */
        public /* synthetic */ class d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f44330a;

            static {
                int[] iArr = new int[vz6.values().length];
                try {
                    iArr[vz6.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[vz6.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f44330a = iArr;
            }
        }

        public C16689b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f44317c = arrayDeque;
            if (rz6.this.f44311a.isDirectory()) {
                arrayDeque.push(m47350j(rz6.this.f44311a));
            } else if (rz6.this.f44311a.isFile()) {
                arrayDeque.push(new b(this, rz6.this.f44311a));
            } else {
                m58856e();
            }
        }

        @Override // p001o.z7
        /* renamed from: a */
        public void mo23854a() {
            File fileM47351k = m47351k();
            if (fileM47351k != null) {
                m58857f(fileM47351k);
            } else {
                m58856e();
            }
        }

        /* renamed from: j */
        public final AbstractC16688a m47350j(File file) {
            int i = d.f44330a[rz6.this.f44312b.ordinal()];
            if (i == 1) {
                return new c(this, file);
            }
            if (i == 2) {
                return new a(this, file);
            }
            throw new szb();
        }

        /* renamed from: k */
        public final File m47351k() {
            File fileMo47352b;
            while (true) {
                AbstractC16690c abstractC16690c = (AbstractC16690c) this.f44317c.peek();
                if (abstractC16690c == null) {
                    return null;
                }
                fileMo47352b = abstractC16690c.mo47352b();
                if (fileMo47352b == null) {
                    this.f44317c.pop();
                } else {
                    if (sq8.m48644c(fileMo47352b, abstractC16690c.m47353a()) || !fileMo47352b.isDirectory() || this.f44317c.size() >= rz6.this.f44316f) {
                        break;
                    }
                    this.f44317c.push(m47350j(fileMo47352b));
                }
            }
            return fileMo47352b;
        }
    }

    /* renamed from: o.rz6$c */
    public static abstract class AbstractC16690c {

        /* renamed from: a */
        public final File f44331a;

        public AbstractC16690c(File file) {
            sq8.m48649h(file, "root");
            this.f44331a = file;
        }

        /* renamed from: a */
        public final File m47353a() {
            return this.f44331a;
        }

        /* renamed from: b */
        public abstract File mo47352b();
    }

    public rz6(File file, vz6 vz6Var, xk7 xk7Var, xk7 xk7Var2, nl7 nl7Var, int i) {
        this.f44311a = file;
        this.f44312b = vz6Var;
        this.f44313c = xk7Var;
        this.f44314d = xk7Var2;
        this.f44315e = nl7Var;
        this.f44316f = i;
    }

    @Override // p001o.ief
    public Iterator iterator() {
        return new C16689b();
    }

    public /* synthetic */ rz6(File file, vz6 vz6Var, xk7 xk7Var, xk7 xk7Var2, nl7 nl7Var, int i, int i2, id5 id5Var) {
        this(file, (i2 & 2) != 0 ? vz6.TOP_DOWN : vz6Var, xk7Var, xk7Var2, nl7Var, (i2 & 32) != 0 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rz6(File file, vz6 vz6Var) {
        this(file, vz6Var, null, null, null, 0, 32, null);
        sq8.m48649h(file, "start");
        sq8.m48649h(vz6Var, "direction");
    }
}
