package a9;

import a1.RunnableC0012k;
import android.content.Context;
import c9.C0914i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import k0.ExecutorC3896f;
import kotlin.jvm.internal.AbstractC4154l;
import l7.AbstractC4422v;
import l7.C4407g;
import l7.C4408h;
import l7.C4419s;
import l7.n0;
import q7.C6140g;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a9.f */
/* loaded from: classes.dex */
public abstract class AbstractC0067f {

    /* renamed from: a */
    public final Object f251a;

    /* renamed from: b */
    public final Object f252b;

    /* renamed from: c */
    public final Object f253c;

    /* renamed from: d */
    public Object f254d;

    /* renamed from: e */
    public final Object f255e;

    public AbstractC0067f(Context context, C0914i c0914i) {
        this.f251a = c0914i;
        Context applicationContext = context.getApplicationContext();
        AbstractC4154l.m8922e(applicationContext, "context.applicationContext");
        this.f252b = applicationContext;
        this.f253c = new Object();
        this.f255e = new LinkedHashSet();
    }

    /* renamed from: a */
    public AbstractC4422v mo186a() {
        AbstractC4422v abstractC4422vMo187b = mo187b();
        abstractC4422vMo187b.f22137d = null;
        for (Map.Entry entry : ((LinkedHashMap) this.f253c).entrySet()) {
            String argumentName = (String) entry.getKey();
            C4408h argument = (C4408h) entry.getValue();
            AbstractC4154l.m8923f(argumentName, "argumentName");
            AbstractC4154l.m8923f(argument, "argument");
            C6140g c6140g = abstractC4422vMo187b.f22135b;
            c6140g.getClass();
            c6140g.f29938d.put(argumentName, argument);
        }
        ArrayList arrayList = (ArrayList) this.f254d;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            abstractC4422vMo187b.m9245b((C4419s) obj);
        }
        for (Map.Entry entry2 : ((LinkedHashMap) this.f255e).entrySet()) {
            abstractC4422vMo187b.m9252v(((Number) entry2.getKey()).intValue(), (C4407g) entry2.getValue());
        }
        String str = (String) this.f252b;
        if (str != null) {
            abstractC4422vMo187b.m9253w(str);
        }
        return abstractC4422vMo187b;
    }

    /* renamed from: b */
    public AbstractC4422v mo187b() {
        return ((n0) this.f251a).mo9193a();
    }

    /* renamed from: c */
    public abstract Object mo182c();

    /* renamed from: d */
    public void m188d(Object obj) {
        synchronized (this.f253c) {
            Object obj2 = this.f254d;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f254d = obj;
                ((ExecutorC3896f) ((C0914i) this.f251a).f5588d).execute(new RunnableC0012k(2, AbstractC6663m.c0((LinkedHashSet) this.f255e), this));
            }
        }
    }

    /* renamed from: e */
    public abstract void mo183e();

    /* renamed from: f */
    public abstract void mo184f();

    public AbstractC0067f(n0 n0Var, String str) {
        this.f251a = n0Var;
        this.f252b = str;
        this.f253c = new LinkedHashMap();
        this.f254d = new ArrayList();
        this.f255e = new LinkedHashMap();
    }
}
