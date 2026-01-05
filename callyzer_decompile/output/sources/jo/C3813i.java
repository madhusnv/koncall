package jo;

import b8.C0614i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import qm.C6245a;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;
import wx.InterfaceC8210k;

/* renamed from: jo.i */
/* loaded from: classes3.dex */
public final class C3813i extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f19720a;

    /* renamed from: b */
    public int f19721b;

    /* renamed from: c */
    public final /* synthetic */ C0614i f19722c;

    /* renamed from: d */
    public InterfaceC8210k f19723d;

    /* renamed from: e */
    public List f19724e;

    /* renamed from: f */
    public Collection f19725f;

    /* renamed from: g */
    public Iterator f19726g;

    /* renamed from: h */
    public C6245a f19727h;

    /* renamed from: j */
    public Collection f19728j;

    /* renamed from: k */
    public int f19729k;

    /* renamed from: l */
    public int f19730l;

    /* renamed from: m */
    public int f19731m;

    /* renamed from: n */
    public int f19732n;

    /* renamed from: p */
    public int f19733p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3813i(C0614i c0614i, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f19722c = c0614i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f19720a = obj;
        this.f19721b |= Integer.MIN_VALUE;
        return this.f19722c.emit(null, this);
    }
}
