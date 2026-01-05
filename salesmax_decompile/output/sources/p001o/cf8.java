package p001o;

import p001o.ese;
import p001o.qja;
import p001o.s48;

/* loaded from: classes2.dex */
public final class cf8 implements tse {

    /* renamed from: a */
    public final q74 f18030a;

    public cf8(q74 q74Var) {
        sq8.m48649h(q74Var, "callContext");
        this.f18030a = q74Var;
    }

    /* renamed from: c */
    public static final String m21121c(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("Non retryable IMDS error: statusCode=");
        o26 o26Var = (o26) th;
        sb.append(o26Var.m41350e());
        sb.append("; ");
        sb.append(o26Var.getMessage());
        return sb.toString();
    }

    /* renamed from: b */
    public final ese m21122b(final Throwable th) {
        if (!(th instanceof o26)) {
            return ese.C13255b.f22117a;
        }
        s48.C16740b c16740b = s48.f44774c;
        s48 s48VarM47795a = c16740b.m47795a(((o26) th).m41350e());
        if (t48.m49281b(s48VarM47795a) == s48.EnumC16739a.SERVER_ERROR) {
            return new ese.C13254a(fse.ServerSide);
        }
        if (sq8.m48644c(s48VarM47795a, c16740b.m47793Y())) {
            return new ese.C13254a(fse.ServerSide);
        }
        q74 q74Var = this.f18030a;
        String strMo26336c = kge.m35689b(cf8.class).mo26336c();
        if (strMo26336c == null) {
            throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
        }
        qja.C16414b.m45548a(v74.m52400e(q74Var, strMo26336c), null, new uk7() { // from class: o.bf8
            @Override // p001o.uk7
            public final Object invoke() {
                return cf8.m21121c(th);
            }
        }, 1, null);
        return ese.C13255b.f22117a;
    }

    @Override // p001o.tse
    public ese evaluate(Object obj) {
        if (vre.m53357h(obj)) {
            return ese.C13256c.f22118a;
        }
        Throwable thM53354e = vre.m53354e(obj);
        sq8.m48646e(thM53354e);
        return m21122b(thM53354e);
    }
}
