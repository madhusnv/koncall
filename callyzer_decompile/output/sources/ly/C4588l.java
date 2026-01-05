package ly;

import hy.C3052c;
import hy.InterfaceC3055f;
import i0.m0;
import iy.InterfaceC3364a;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jy.n0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.a0;
import ky.AbstractC4271c;
import ky.AbstractC4281m;
import ky.C4278j;
import ky.C4289u;
import ky.C4294z;
import og.qe;
import rw.AbstractC6674x;
import rw.C6670t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ly.l */
/* loaded from: classes3.dex */
public class C4588l extends AbstractC4577a {

    /* renamed from: f */
    public final C4294z f22720f;

    /* renamed from: g */
    public final InterfaceC3055f f22721g;

    /* renamed from: h */
    public int f22722h;

    /* renamed from: i */
    public boolean f22723i;

    public /* synthetic */ C4588l(AbstractC4271c abstractC4271c, C4294z c4294z, String str, int i10) {
        this(abstractC4271c, c4294z, (i10 & 4) != 0 ? null : str, (InterfaceC3055f) null);
    }

    @Override // ly.AbstractC4577a
    /* renamed from: E */
    public AbstractC4281m mo9400E(String tag) {
        AbstractC4154l.m8923f(tag, "tag");
        return (AbstractC4281m) AbstractC6674x.m12774b(mo9414S(), tag);
    }

    @Override // ly.AbstractC4577a
    /* renamed from: Q */
    public String mo9412Q(InterfaceC3055f descriptor, int i10) {
        Object next;
        AbstractC4154l.m8923f(descriptor, "descriptor");
        AbstractC4271c abstractC4271c = this.f22703c;
        C4289u c4289uM9434o = AbstractC4585i.m9434o(descriptor, abstractC4271c);
        String strMo7282g = descriptor.mo7282g(i10);
        if (c4289uM9434o != null || (this.f22705e.f21685e && !mo9414S().f21699a.keySet().contains(strMo7282g))) {
            Map mapM9429j = AbstractC4585i.m9429j(descriptor, abstractC4271c);
            Iterator it = mo9414S().f21699a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) mapM9429j.get((String) next);
                if (num != null && num.intValue() == i10) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
            String strM8994a = c4289uM9434o != null ? c4289uM9434o.m8994a(descriptor, strMo7282g) : null;
            if (strM8994a != null) {
                return strM8994a;
            }
        }
        return strMo7282g;
    }

    @Override // ly.AbstractC4577a
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public C4294z mo9414S() {
        return this.f22720f;
    }

    @Override // ly.AbstractC4577a, iy.InterfaceC3364a
    /* renamed from: b */
    public void mo7680b(InterfaceC3055f descriptor) {
        Set setM10858d;
        AbstractC4154l.m8923f(descriptor, "descriptor");
        C4278j c4278j = this.f22705e;
        if (c4278j.f21681a || (descriptor.mo7280e() instanceof C3052c)) {
            return;
        }
        AbstractC4271c abstractC4271c = this.f22703c;
        C4289u c4289uM9434o = AbstractC4585i.m9434o(descriptor, abstractC4271c);
        if (c4289uM9434o == null && !c4278j.f21685e) {
            setM10858d = n0.m8421b(descriptor);
        } else if (c4289uM9434o != null) {
            setM10858d = AbstractC4585i.m9429j(descriptor, abstractC4271c).keySet();
        } else {
            Set setM8421b = n0.m8421b(descriptor);
            Map map = (Map) abstractC4271c.f21669c.m9050h(descriptor, AbstractC4585i.f22716a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = C6670t.f31945a;
            }
            setM10858d = qe.m10858d(setM8421b, setKeySet);
        }
        for (String key : mo9414S().f21699a.keySet()) {
            if (!setM10858d.contains(key) && !AbstractC4154l.m8918a(key, this.f22704d)) {
                String input = mo9414S().toString();
                AbstractC4154l.m8923f(key, "key");
                AbstractC4154l.m8923f(input, "input");
                StringBuilder sbM7383p = m0.m7383p("Encountered an unknown key '", key, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                sbM7383p.append((Object) AbstractC4585i.m9433n(input, -1));
                throw AbstractC4585i.m9424e(-1, sbM7383p.toString());
            }
        }
    }

    @Override // ly.AbstractC4577a, iy.InterfaceC3366c
    /* renamed from: c */
    public final InterfaceC3364a mo7699c(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        InterfaceC3055f interfaceC3055f = this.f22721g;
        if (descriptor != interfaceC3055f) {
            return super.mo7699c(descriptor);
        }
        AbstractC4281m abstractC4281mM9401F = m9401F();
        String strMo7277a = interfaceC3055f.mo7277a();
        if (abstractC4281mM9401F instanceof C4294z) {
            return new C4588l(this.f22703c, (C4294z) abstractC4281mM9401F, this.f22704d, interfaceC3055f);
        }
        throw AbstractC4585i.m9423d(-1, abstractC4281mM9401F.toString(), "Expected " + a0.m8901a(C4294z.class).m8914c() + ", but had " + a0.m8901a(abstractC4281mM9401F.getClass()).m8914c() + " as the serialized body of " + strMo7277a + " at element: " + m9416U());
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: o */
    public int mo7685o(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        while (this.f22722h < descriptor.mo7281f()) {
            int i10 = this.f22722h;
            this.f22722h = i10 + 1;
            String strM9413R = m9413R(descriptor, i10);
            int i11 = this.f22722h - 1;
            this.f22723i = false;
            if (!mo9414S().containsKey(strM9413R)) {
                boolean z6 = (this.f22703c.f21667a.f21682b || descriptor.mo7285j(i11) || !descriptor.mo7284i(i11).mo7278c()) ? false : true;
                this.f22723i = z6;
                if (z6) {
                }
            }
            this.f22705e.getClass();
            return i11;
        }
        return -1;
    }

    @Override // ly.AbstractC4577a, iy.InterfaceC3366c
    /* renamed from: q */
    public final boolean mo7707q() {
        return !this.f22723i && super.mo7707q();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4588l(AbstractC4271c json, C4294z c4294z, String str, InterfaceC3055f interfaceC3055f) {
        super(json, str);
        AbstractC4154l.m8923f(json, "json");
        this.f22720f = c4294z;
        this.f22721g = interfaceC3055f;
    }
}
