package pf;

import android.os.Parcel;
import android.os.RemoteException;
import cg.BinderC0969b;
import cg.InterfaceC0968a;
import ig.AbstractBinderC3252h;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import lg.AbstractC4464a;
import org.bouncycastle.i18n.LocalizedMessage;
import sf.AbstractC6840z;
import sf.InterfaceC6835u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pf.m */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5913m extends AbstractBinderC3252h implements InterfaceC6835u {

    /* renamed from: f */
    public final int f28768f;

    public AbstractBinderC5913m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 2);
        AbstractC6840z.m13031b(bArr.length == 25);
        this.f28768f = Arrays.hashCode(bArr);
    }

    /* renamed from: R */
    public static byte[] m11524R(String str) {
        try {
            return str.getBytes(LocalizedMessage.DEFAULT_ENCODING);
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // ig.AbstractBinderC3252h
    /* renamed from: Q */
    public final boolean mo7597Q(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            InterfaceC0968a interfaceC0968aMo11526e = mo11526e();
            parcel2.writeNoException();
            AbstractC4464a.m9311c(parcel2, interfaceC0968aMo11526e);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f28768f);
        return true;
    }

    /* renamed from: S */
    public abstract byte[] mo11523S();

    @Override // sf.InterfaceC6835u
    /* renamed from: b */
    public final int mo11525b() {
        return this.f28768f;
    }

    @Override // sf.InterfaceC6835u
    /* renamed from: e */
    public final InterfaceC0968a mo11526e() {
        return new BinderC0969b(mo11523S());
    }

    public final boolean equals(Object obj) {
        InterfaceC0968a interfaceC0968aMo11526e;
        if (obj == null || !(obj instanceof InterfaceC6835u)) {
            return false;
        }
        try {
            InterfaceC6835u interfaceC6835u = (InterfaceC6835u) obj;
            if (interfaceC6835u.mo11525b() == this.f28768f && (interfaceC0968aMo11526e = interfaceC6835u.mo11526e()) != null) {
                return Arrays.equals(mo11523S(), (byte[]) BinderC0969b.m2727S(interfaceC0968aMo11526e));
            }
            return false;
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.f28768f;
    }
}
