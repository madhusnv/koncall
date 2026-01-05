package p001o;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class ms6 {

    /* renamed from: a */
    public static final InterfaceC15419g f35906a = new C15413a();

    /* renamed from: o.ms6$a */
    public class C15413a implements InterfaceC15419g {
        @Override // p001o.ms6.InterfaceC15419g
        /* renamed from: a */
        public void mo39606a(Object obj) {
        }
    }

    /* renamed from: o.ms6$b */
    public class C15414b implements InterfaceC15416d {
        @Override // p001o.ms6.InterfaceC15416d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List create() {
            return new ArrayList();
        }
    }

    /* renamed from: o.ms6$c */
    public class C15415c implements InterfaceC15419g {
        @Override // p001o.ms6.InterfaceC15419g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo39606a(List list) {
            list.clear();
        }
    }

    /* renamed from: o.ms6$d */
    public interface InterfaceC15416d {
        Object create();
    }

    /* renamed from: o.ms6$e */
    public static final class C15417e implements ged {

        /* renamed from: a */
        public final InterfaceC15416d f35907a;

        /* renamed from: b */
        public final InterfaceC15419g f35908b;

        /* renamed from: c */
        public final ged f35909c;

        public C15417e(ged gedVar, InterfaceC15416d interfaceC15416d, InterfaceC15419g interfaceC15419g) {
            this.f35909c = gedVar;
            this.f35907a = interfaceC15416d;
            this.f35908b = interfaceC15419g;
        }

        @Override // p001o.ged
        /* renamed from: a */
        public boolean mo28525a(Object obj) {
            if (obj instanceof InterfaceC15418f) {
                ((InterfaceC15418f) obj).mo18850d().mo29828b(true);
            }
            this.f35908b.mo39606a(obj);
            return this.f35909c.mo28525a(obj);
        }

        @Override // p001o.ged
        /* renamed from: b */
        public Object mo28526b() {
            Object objMo28526b = this.f35909c.mo28526b();
            if (objMo28526b == null) {
                objMo28526b = this.f35907a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(objMo28526b.getClass());
                }
            }
            if (objMo28526b instanceof InterfaceC15418f) {
                ((InterfaceC15418f) objMo28526b).mo18850d().mo29828b(false);
            }
            return objMo28526b;
        }
    }

    /* renamed from: o.ms6$f */
    public interface InterfaceC15418f {
        /* renamed from: d */
        h5g mo18850d();
    }

    /* renamed from: o.ms6$g */
    public interface InterfaceC15419g {
        /* renamed from: a */
        void mo39606a(Object obj);
    }

    /* renamed from: a */
    public static ged m39600a(ged gedVar, InterfaceC15416d interfaceC15416d) {
        return m39601b(gedVar, interfaceC15416d, m39602c());
    }

    /* renamed from: b */
    public static ged m39601b(ged gedVar, InterfaceC15416d interfaceC15416d, InterfaceC15419g interfaceC15419g) {
        return new C15417e(gedVar, interfaceC15416d, interfaceC15419g);
    }

    /* renamed from: c */
    public static InterfaceC15419g m39602c() {
        return f35906a;
    }

    /* renamed from: d */
    public static ged m39603d(int i, InterfaceC15416d interfaceC15416d) {
        return m39600a(new ked(i), interfaceC15416d);
    }

    /* renamed from: e */
    public static ged m39604e() {
        return m39605f(20);
    }

    /* renamed from: f */
    public static ged m39605f(int i) {
        return m39601b(new ked(i), new C15414b(), new C15415c());
    }
}
