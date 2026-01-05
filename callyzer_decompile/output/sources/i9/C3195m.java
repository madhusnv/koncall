package i9;

import aws.smithy.kotlin.runtime.auth.awscredentials.CredentialsProviderException;
import ay.C0496f;
import ay.ExecutorC0495e;
import bu.C0782a;
import ex.InterfaceC2141e;
import java.io.BufferedReader;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i9.m */
/* loaded from: classes.dex */
public final class C3195m extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public int f17208a;

    /* renamed from: b */
    public final /* synthetic */ BufferedReader f17209b;

    /* renamed from: c */
    public final /* synthetic */ char[] f17210c;

    /* renamed from: d */
    public final /* synthetic */ StringBuilder f17211d;

    /* renamed from: e */
    public final /* synthetic */ long f17212e;

    /* renamed from: f */
    public final /* synthetic */ Process f17213f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3195m(BufferedReader bufferedReader, char[] cArr, StringBuilder sb2, long j6, Process process, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f17209b = bufferedReader;
        this.f17210c = cArr;
        this.f17211d = sb2;
        this.f17212e = j6;
        this.f17213f = process;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C3195m(this.f17209b, this.f17210c, this.f17211d, this.f17212e, this.f17213f, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C3195m) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long length;
        long j6;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f17208a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return obj;
        }
        od.m10798c(obj);
        do {
            BufferedReader bufferedReader = this.f17209b;
            char[] cArr = this.f17210c;
            if (bufferedReader.read(cArr) == -1) {
                C0496f c0496f = tx.m0.f34659a;
                ExecutorC0495e executorC0495e = ExecutorC0495e.f3538c;
                C0782a c0782a = new C0782a(this.f17213f, null, 9);
                this.f17208a = 1;
                Object objM13475K = tx.c0.m13475K(executorC0495e, c0782a, this);
                return objM13475K == enumC7794a ? enumC7794a : objM13475K;
            }
            StringBuilder sb2 = this.f17211d;
            sb2.append(cArr);
            length = sb2.length();
            j6 = this.f17212e;
        } while (length <= j6);
        throw new CredentialsProviderException("Process output exceeded limit of " + j6 + " bytes", 0);
    }
}
