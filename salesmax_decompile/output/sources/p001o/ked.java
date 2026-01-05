package p001o;

/* loaded from: classes2.dex */
public class ked extends ied {

    /* renamed from: c */
    public final Object f32113c;

    public ked(int i) {
        super(i);
        this.f32113c = new Object();
    }

    @Override // p001o.ied, p001o.ged
    /* renamed from: a */
    public boolean mo28525a(Object obj) {
        boolean zMo28525a;
        sq8.m48649h(obj, "instance");
        synchronized (this.f32113c) {
            zMo28525a = super.mo28525a(obj);
        }
        return zMo28525a;
    }

    @Override // p001o.ied, p001o.ged
    /* renamed from: b */
    public Object mo28526b() {
        Object objMo28526b;
        synchronized (this.f32113c) {
            objMo28526b = super.mo28526b();
        }
        return objMo28526b;
    }
}
