package p001o;

/* loaded from: classes5.dex */
public abstract class qt5 {

    /* renamed from: a */
    public static final qt5 f42382a = new C16455a();

    /* renamed from: b */
    public static final qt5 f42383b = new C16456b();

    /* renamed from: c */
    public static final qt5 f42384c = new C16457c();

    /* renamed from: d */
    public static final qt5 f42385d = new C16458d();

    /* renamed from: e */
    public static final qt5 f42386e = new C16459e();

    /* renamed from: o.qt5$a */
    public class C16455a extends qt5 {
        @Override // p001o.qt5
        /* renamed from: a */
        public boolean mo45828a() {
            return true;
        }

        @Override // p001o.qt5
        /* renamed from: b */
        public boolean mo45829b() {
            return true;
        }

        @Override // p001o.qt5
        /* renamed from: c */
        public boolean mo45830c(ez4 ez4Var) {
            return ez4Var == ez4.REMOTE;
        }

        @Override // p001o.qt5
        /* renamed from: d */
        public boolean mo45831d(boolean z, ez4 ez4Var, a76 a76Var) {
            return (ez4Var == ez4.RESOURCE_DISK_CACHE || ez4Var == ez4.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: o.qt5$b */
    public class C16456b extends qt5 {
        @Override // p001o.qt5
        /* renamed from: a */
        public boolean mo45828a() {
            return false;
        }

        @Override // p001o.qt5
        /* renamed from: b */
        public boolean mo45829b() {
            return false;
        }

        @Override // p001o.qt5
        /* renamed from: c */
        public boolean mo45830c(ez4 ez4Var) {
            return false;
        }

        @Override // p001o.qt5
        /* renamed from: d */
        public boolean mo45831d(boolean z, ez4 ez4Var, a76 a76Var) {
            return false;
        }
    }

    /* renamed from: o.qt5$c */
    public class C16457c extends qt5 {
        @Override // p001o.qt5
        /* renamed from: a */
        public boolean mo45828a() {
            return true;
        }

        @Override // p001o.qt5
        /* renamed from: b */
        public boolean mo45829b() {
            return false;
        }

        @Override // p001o.qt5
        /* renamed from: c */
        public boolean mo45830c(ez4 ez4Var) {
            return (ez4Var == ez4.DATA_DISK_CACHE || ez4Var == ez4.MEMORY_CACHE) ? false : true;
        }

        @Override // p001o.qt5
        /* renamed from: d */
        public boolean mo45831d(boolean z, ez4 ez4Var, a76 a76Var) {
            return false;
        }
    }

    /* renamed from: o.qt5$d */
    public class C16458d extends qt5 {
        @Override // p001o.qt5
        /* renamed from: a */
        public boolean mo45828a() {
            return false;
        }

        @Override // p001o.qt5
        /* renamed from: b */
        public boolean mo45829b() {
            return true;
        }

        @Override // p001o.qt5
        /* renamed from: c */
        public boolean mo45830c(ez4 ez4Var) {
            return false;
        }

        @Override // p001o.qt5
        /* renamed from: d */
        public boolean mo45831d(boolean z, ez4 ez4Var, a76 a76Var) {
            return (ez4Var == ez4.RESOURCE_DISK_CACHE || ez4Var == ez4.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: o.qt5$e */
    public class C16459e extends qt5 {
        @Override // p001o.qt5
        /* renamed from: a */
        public boolean mo45828a() {
            return true;
        }

        @Override // p001o.qt5
        /* renamed from: b */
        public boolean mo45829b() {
            return true;
        }

        @Override // p001o.qt5
        /* renamed from: c */
        public boolean mo45830c(ez4 ez4Var) {
            return ez4Var == ez4.REMOTE;
        }

        @Override // p001o.qt5
        /* renamed from: d */
        public boolean mo45831d(boolean z, ez4 ez4Var, a76 a76Var) {
            return ((z && ez4Var == ez4.DATA_DISK_CACHE) || ez4Var == ez4.LOCAL) && a76Var == a76.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo45828a();

    /* renamed from: b */
    public abstract boolean mo45829b();

    /* renamed from: c */
    public abstract boolean mo45830c(ez4 ez4Var);

    /* renamed from: d */
    public abstract boolean mo45831d(boolean z, ez4 ez4Var, a76 a76Var);
}
