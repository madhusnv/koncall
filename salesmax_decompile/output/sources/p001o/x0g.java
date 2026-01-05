package p001o;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class x0g {

    /* renamed from: a */
    public final hh2 f53021a;

    /* renamed from: b */
    public final boolean f53022b;

    /* renamed from: c */
    public final InterfaceC18029d f53023c;

    /* renamed from: d */
    public final int f53024d;

    /* renamed from: o.x0g$a */
    public class C18026a implements InterfaceC18029d {

        /* renamed from: a */
        public final /* synthetic */ hh2 f53025a;

        /* renamed from: o.x0g$a$a */
        public class a extends AbstractC18028c {
            public a(x0g x0gVar, CharSequence charSequence) {
                super(x0gVar, charSequence);
            }

            @Override // p001o.x0g.AbstractC18028c
            /* renamed from: g */
            public int mo55539g(int i) {
                return i + 1;
            }

            @Override // p001o.x0g.AbstractC18028c
            /* renamed from: i */
            public int mo55540i(int i) {
                return C18026a.this.f53025a.mo30439c(this.f53029c, i);
            }
        }

        public C18026a(hh2 hh2Var) {
            this.f53025a = hh2Var;
        }

        @Override // p001o.x0g.InterfaceC18029d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC18028c mo55537a(x0g x0gVar, CharSequence charSequence) {
            return new a(x0gVar, charSequence);
        }
    }

    /* renamed from: o.x0g$b */
    public class C18027b implements Iterable {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f53027a;

        public C18027b(CharSequence charSequence) {
            this.f53027a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return x0g.this.m55536i(this.f53027a);
        }

        public String toString() {
            h79 h79VarM29890g = h79.m29890g(", ");
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            StringBuilder sbM29892b = h79VarM29890g.m29892b(sb, this);
            sbM29892b.append(']');
            return sbM29892b.toString();
        }
    }

    /* renamed from: o.x0g$c */
    public static abstract class AbstractC18028c extends w7 {

        /* renamed from: c */
        public final CharSequence f53029c;

        /* renamed from: d */
        public final hh2 f53030d;

        /* renamed from: e */
        public final boolean f53031e;

        /* renamed from: f */
        public int f53032f = 0;

        /* renamed from: g */
        public int f53033g;

        public AbstractC18028c(x0g x0gVar, CharSequence charSequence) {
            this.f53030d = x0gVar.f53021a;
            this.f53031e = x0gVar.f53022b;
            this.f53033g = x0gVar.f53024d;
            this.f53029c = charSequence;
        }

        @Override // p001o.w7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public String mo54014a() {
            int iMo55540i;
            int i = this.f53032f;
            while (true) {
                int i2 = this.f53032f;
                if (i2 == -1) {
                    return (String) m54015b();
                }
                iMo55540i = mo55540i(i2);
                if (iMo55540i == -1) {
                    iMo55540i = this.f53029c.length();
                    this.f53032f = -1;
                } else {
                    this.f53032f = mo55539g(iMo55540i);
                }
                int i3 = this.f53032f;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.f53032f = i4;
                    if (i4 > this.f53029c.length()) {
                        this.f53032f = -1;
                    }
                } else {
                    while (i < iMo55540i && this.f53030d.mo30440e(this.f53029c.charAt(i))) {
                        i++;
                    }
                    while (iMo55540i > i && this.f53030d.mo30440e(this.f53029c.charAt(iMo55540i - 1))) {
                        iMo55540i--;
                    }
                    if (!this.f53031e || i != iMo55540i) {
                        break;
                    }
                    i = this.f53032f;
                }
            }
            int i5 = this.f53033g;
            if (i5 == 1) {
                iMo55540i = this.f53029c.length();
                this.f53032f = -1;
                while (iMo55540i > i && this.f53030d.mo30440e(this.f53029c.charAt(iMo55540i - 1))) {
                    iMo55540i--;
                }
            } else {
                this.f53033g = i5 - 1;
            }
            return this.f53029c.subSequence(i, iMo55540i).toString();
        }

        /* renamed from: g */
        public abstract int mo55539g(int i);

        /* renamed from: i */
        public abstract int mo55540i(int i);
    }

    /* renamed from: o.x0g$d */
    public interface InterfaceC18029d {
        /* renamed from: a */
        Iterator mo55537a(x0g x0gVar, CharSequence charSequence);
    }

    public x0g(InterfaceC18029d interfaceC18029d) {
        this(interfaceC18029d, false, hh2.m30436f(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* renamed from: e */
    public static x0g m55532e(char c) {
        return m55533f(hh2.m30435d(c));
    }

    /* renamed from: f */
    public static x0g m55533f(hh2 hh2Var) {
        dgd.m23062o(hh2Var);
        return new x0g(new C18026a(hh2Var));
    }

    /* renamed from: g */
    public Iterable m55534g(CharSequence charSequence) {
        dgd.m23062o(charSequence);
        return new C18027b(charSequence);
    }

    /* renamed from: h */
    public List m55535h(CharSequence charSequence) {
        dgd.m23062o(charSequence);
        Iterator itM55536i = m55536i(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itM55536i.hasNext()) {
            arrayList.add((String) itM55536i.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: i */
    public final Iterator m55536i(CharSequence charSequence) {
        return this.f53023c.mo55537a(this, charSequence);
    }

    public x0g(InterfaceC18029d interfaceC18029d, boolean z, hh2 hh2Var, int i) {
        this.f53023c = interfaceC18029d;
        this.f53022b = z;
        this.f53021a = hh2Var;
        this.f53024d = i;
    }
}
