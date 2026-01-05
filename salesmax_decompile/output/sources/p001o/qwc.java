package p001o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.storage.ObjectMetadata;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p001o.oob;
import retrofit2.Converter;

/* loaded from: classes6.dex */
public abstract class qwc {

    /* renamed from: o.qwc$a */
    public class C16466a extends qwc {
        public C16466a() {
        }

        @Override // p001o.qwc
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo45881a(zle zleVar, Iterable iterable) {
            if (iterable == null) {
                return;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                qwc.this.mo45881a(zleVar, it.next());
            }
        }
    }

    /* renamed from: o.qwc$b */
    public class C16467b extends qwc {
        public C16467b() {
        }

        @Override // p001o.qwc
        /* renamed from: a */
        public void mo45881a(zle zleVar, Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                qwc.this.mo45881a(zleVar, Array.get(obj, i));
            }
        }
    }

    /* renamed from: o.qwc$c */
    public static final class C16468c extends qwc {

        /* renamed from: a */
        public final Method f42495a;

        /* renamed from: b */
        public final int f42496b;

        /* renamed from: c */
        public final Converter f42497c;

        public C16468c(Method method, int i, Converter converter) {
            this.f42495a = method;
            this.f42496b = i;
            this.f42497c = converter;
        }

        @Override // p001o.qwc
        /* renamed from: a */
        public void mo45881a(zle zleVar, Object obj) {
            if (obj == null) {
                throw lri.m37846o(this.f42495a, this.f42496b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                zleVar.m59596l((xle) this.f42497c.convert(obj));
            } catch (IOException e) {
                throw lri.m37847p(this.f42495a, e, this.f42496b, "Unable to convert " + obj + " to RequestBody", new Object[0]);
            }
        }
    }

    /* renamed from: o.qwc$d */
    public static final class C16469d extends qwc {

        /* renamed from: a */
        public final String f42498a;

        /* renamed from: b */
        public final Converter f42499b;

        /* renamed from: c */
        public final boolean f42500c;

        public C16469d(String str, Converter converter, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f42498a = str;
            this.f42499b = converter;
            this.f42500c = z;
        }

        @Override // p001o.qwc
        /* renamed from: a */
        public void mo45881a(zle zleVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f42499b.convert(obj)) == null) {
                return;
            }
            zleVar.m59587a(this.f42498a, str, this.f42500c);
        }
    }

    /* renamed from: o.qwc$e */
    public static final class C16470e extends qwc {

        /* renamed from: a */
        public final Method f42501a;

        /* renamed from: b */
        public final int f42502b;

        /* renamed from: c */
        public final Converter f42503c;

        /* renamed from: d */
        public final boolean f42504d;

        public C16470e(Method method, int i, Converter converter, boolean z) {
            this.f42501a = method;
            this.f42502b = i;
            this.f42503c = converter;
            this.f42504d = z;
        }

        @Override // p001o.qwc
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo45881a(zle zleVar, Map map) {
            if (map == null) {
                throw lri.m37846o(this.f42501a, this.f42502b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw lri.m37846o(this.f42501a, this.f42502b, "Field map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw lri.m37846o(this.f42501a, this.f42502b, "Field map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f42503c.convert(value);
                if (str2 == null) {
                    throw lri.m37846o(this.f42501a, this.f42502b, "Field map value '" + value + "' converted to null by " + this.f42503c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                zleVar.m59587a(str, str2, this.f42504d);
            }
        }
    }

    /* renamed from: o.qwc$f */
    public static final class C16471f extends qwc {

        /* renamed from: a */
        public final String f42505a;

        /* renamed from: b */
        public final Converter f42506b;

        public C16471f(String str, Converter converter) {
            Objects.requireNonNull(str, "name == null");
            this.f42505a = str;
            this.f42506b = converter;
        }

        @Override // p001o.qwc
        /* renamed from: a */
        public void mo45881a(zle zleVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f42506b.convert(obj)) == null) {
                return;
            }
            zleVar.m59588b(this.f42505a, str);
        }
    }

    /* renamed from: o.qwc$g */
    public static final class C16472g extends qwc {

        /* renamed from: a */
        public final Method f42507a;

        /* renamed from: b */
        public final int f42508b;

        /* renamed from: c */
        public final Converter f42509c;

        public C16472g(Method method, int i, Converter converter) {
            this.f42507a = method;
            this.f42508b = i;
            this.f42509c = converter;
        }

        @Override // p001o.qwc
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo45881a(zle zleVar, Map map) {
            if (map == null) {
                throw lri.m37846o(this.f42507a, this.f42508b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw lri.m37846o(this.f42507a, this.f42508b, "Header map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw lri.m37846o(this.f42507a, this.f42508b, "Header map contained null value for key '" + str + "'.", new Object[0]);
                }
                zleVar.m59588b(str, (String) this.f42509c.convert(value));
            }
        }
    }

    /* renamed from: o.qwc$h */
    public static final class C16473h extends qwc {

        /* renamed from: a */
        public final Method f42510a;

        /* renamed from: b */
        public final int f42511b;

        public C16473h(Method method, int i) {
            this.f42510a = method;
            this.f42511b = i;
        }

        @Override // p001o.qwc
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo45881a(zle zleVar, wx7 wx7Var) {
            if (wx7Var == null) {
                throw lri.m37846o(this.f42510a, this.f42511b, "Headers parameter must not be null.", new Object[0]);
            }
            zleVar.m59589c(wx7Var);
        }
    }

    /* renamed from: o.qwc$i */
    public static final class C16474i extends qwc {

        /* renamed from: a */
        public final Method f42512a;

        /* renamed from: b */
        public final int f42513b;

        /* renamed from: c */
        public final wx7 f42514c;

        /* renamed from: d */
        public final Converter f42515d;

        public C16474i(Method method, int i, wx7 wx7Var, Converter converter) {
            this.f42512a = method;
            this.f42513b = i;
            this.f42514c = wx7Var;
            this.f42515d = converter;
        }

        @Override // p001o.qwc
        /* renamed from: a */
        public void mo45881a(zle zleVar, Object obj) {
            if (obj == null) {
                return;
            }
            try {
                zleVar.m59590d(this.f42514c, (xle) this.f42515d.convert(obj));
            } catch (IOException e) {
                throw lri.m37846o(this.f42512a, this.f42513b, "Unable to convert " + obj + " to RequestBody", e);
            }
        }
    }

    /* renamed from: o.qwc$j */
    public static final class C16475j extends qwc {

        /* renamed from: a */
        public final Method f42516a;

        /* renamed from: b */
        public final int f42517b;

        /* renamed from: c */
        public final Converter f42518c;

        /* renamed from: d */
        public final String f42519d;

        public C16475j(Method method, int i, Converter converter, String str) {
            this.f42516a = method;
            this.f42517b = i;
            this.f42518c = converter;
            this.f42519d = str;
        }

        @Override // p001o.qwc
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo45881a(zle zleVar, Map map) {
            if (map == null) {
                throw lri.m37846o(this.f42516a, this.f42517b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw lri.m37846o(this.f42516a, this.f42517b, "Part map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw lri.m37846o(this.f42516a, this.f42517b, "Part map contained null value for key '" + str + "'.", new Object[0]);
                }
                zleVar.m59590d(wx7.m55326r(ObjectMetadata.CONTENT_DISPOSITION, "form-data; name=\"" + str + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "Content-Transfer-Encoding", this.f42519d), (xle) this.f42518c.convert(value));
            }
        }
    }

    /* renamed from: o.qwc$k */
    public static final class C16476k extends qwc {

        /* renamed from: a */
        public final Method f42520a;

        /* renamed from: b */
        public final int f42521b;

        /* renamed from: c */
        public final String f42522c;

        /* renamed from: d */
        public final Converter f42523d;

        /* renamed from: e */
        public final boolean f42524e;

        public C16476k(Method method, int i, String str, Converter converter, boolean z) {
            this.f42520a = method;
            this.f42521b = i;
            Objects.requireNonNull(str, "name == null");
            this.f42522c = str;
            this.f42523d = converter;
            this.f42524e = z;
        }

        @Override // p001o.qwc
        /* renamed from: a */
        public void mo45881a(zle zleVar, Object obj) {
            if (obj != null) {
                zleVar.m59592f(this.f42522c, (String) this.f42523d.convert(obj), this.f42524e);
                return;
            }
            throw lri.m37846o(this.f42520a, this.f42521b, "Path parameter \"" + this.f42522c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: o.qwc$l */
    public static final class C16477l extends qwc {

        /* renamed from: a */
        public final String f42525a;

        /* renamed from: b */
        public final Converter f42526b;

        /* renamed from: c */
        public final boolean f42527c;

        public C16477l(String str, Converter converter, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f42525a = str;
            this.f42526b = converter;
            this.f42527c = z;
        }

        @Override // p001o.qwc
        /* renamed from: a */
        public void mo45881a(zle zleVar, Object obj) {
            String str;
            if (obj == null || (str = (String) this.f42526b.convert(obj)) == null) {
                return;
            }
            zleVar.m59593g(this.f42525a, str, this.f42527c);
        }
    }

    /* renamed from: o.qwc$m */
    public static final class C16478m extends qwc {

        /* renamed from: a */
        public final Method f42528a;

        /* renamed from: b */
        public final int f42529b;

        /* renamed from: c */
        public final Converter f42530c;

        /* renamed from: d */
        public final boolean f42531d;

        public C16478m(Method method, int i, Converter converter, boolean z) {
            this.f42528a = method;
            this.f42529b = i;
            this.f42530c = converter;
            this.f42531d = z;
        }

        @Override // p001o.qwc
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo45881a(zle zleVar, Map map) {
            if (map == null) {
                throw lri.m37846o(this.f42528a, this.f42529b, "Query map was null", new Object[0]);
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw lri.m37846o(this.f42528a, this.f42529b, "Query map contained null key.", new Object[0]);
                }
                Object value = entry.getValue();
                if (value == null) {
                    throw lri.m37846o(this.f42528a, this.f42529b, "Query map contained null value for key '" + str + "'.", new Object[0]);
                }
                String str2 = (String) this.f42530c.convert(value);
                if (str2 == null) {
                    throw lri.m37846o(this.f42528a, this.f42529b, "Query map value '" + value + "' converted to null by " + this.f42530c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                }
                zleVar.m59593g(str, str2, this.f42531d);
            }
        }
    }

    /* renamed from: o.qwc$n */
    public static final class C16479n extends qwc {

        /* renamed from: a */
        public final Converter f42532a;

        /* renamed from: b */
        public final boolean f42533b;

        public C16479n(Converter converter, boolean z) {
            this.f42532a = converter;
            this.f42533b = z;
        }

        @Override // p001o.qwc
        /* renamed from: a */
        public void mo45881a(zle zleVar, Object obj) {
            if (obj == null) {
                return;
            }
            zleVar.m59593g((String) this.f42532a.convert(obj), null, this.f42533b);
        }
    }

    /* renamed from: o.qwc$o */
    public static final class C16480o extends qwc {

        /* renamed from: a */
        public static final C16480o f42534a = new C16480o();

        @Override // p001o.qwc
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void mo45881a(zle zleVar, oob.C15856c c15856c) {
            if (c15856c != null) {
                zleVar.m59591e(c15856c);
            }
        }
    }

    /* renamed from: o.qwc$p */
    public static final class C16481p extends qwc {

        /* renamed from: a */
        public final Method f42535a;

        /* renamed from: b */
        public final int f42536b;

        public C16481p(Method method, int i) {
            this.f42535a = method;
            this.f42536b = i;
        }

        @Override // p001o.qwc
        /* renamed from: a */
        public void mo45881a(zle zleVar, Object obj) {
            if (obj == null) {
                throw lri.m37846o(this.f42535a, this.f42536b, "@Url parameter is null.", new Object[0]);
            }
            zleVar.m59597m(obj);
        }
    }

    /* renamed from: o.qwc$q */
    public static final class C16482q extends qwc {

        /* renamed from: a */
        public final Class f42537a;

        public C16482q(Class cls) {
            this.f42537a = cls;
        }

        @Override // p001o.qwc
        /* renamed from: a */
        public void mo45881a(zle zleVar, Object obj) {
            zleVar.m59594h(this.f42537a, obj);
        }
    }

    /* renamed from: a */
    public abstract void mo45881a(zle zleVar, Object obj);

    /* renamed from: b */
    public final qwc m45882b() {
        return new C16467b();
    }

    /* renamed from: c */
    public final qwc m45883c() {
        return new C16466a();
    }
}
