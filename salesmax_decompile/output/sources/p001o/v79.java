package p001o;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
import p001o.aff;
import p001o.dn5;
import p001o.t7f;
import p001o.w79;

/* loaded from: classes2.dex */
public abstract class v79 {
    /* renamed from: a */
    public static final Object m52407a(dn5 dn5Var, n64 n64Var) {
        h7f h7fVar;
        String lowerCase;
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar2 = new h7f(c12163j, new na9("Code"));
        h7f h7fVar3 = new h7f(c12163j, new na9("AccessKeyId"));
        h7f h7fVar4 = new h7f(c12163j, new na9("SecretAccessKey"));
        h7f h7fVar5 = new h7f(c12163j, new na9("Token"));
        h7f h7fVar6 = new h7f(aff.C12165l.f14624a, new na9("Expiration"));
        h7f h7fVar7 = new h7f(c12163j, new na9("AccountId"));
        h7f h7fVar8 = new h7f(c12163j, new na9("Message"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        c17016a.m49539b(h7fVar6);
        c17016a.m49539b(h7fVar7);
        c17016a.m49539b(h7fVar8);
        try {
            dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
            String strMo31726i = null;
            String strMo31726i2 = null;
            String strMo31726i3 = null;
            String strMo31726i4 = null;
            String strMo31726i5 = null;
            gk8 gk8VarM28960d = null;
            String strMo31726i6 = null;
            while (true) {
                Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
                int iM29946a = h7fVar2.m29946a();
                if (numMo23583m == null) {
                    h7fVar = h7fVar2;
                } else {
                    h7fVar = h7fVar2;
                    if (numMo23583m.intValue() == iM29946a) {
                        strMo31726i = interfaceC12997cMo23579h.mo31726i();
                    }
                    h7fVar2 = h7fVar;
                }
                int iM29946a2 = h7fVar3.m29946a();
                if (numMo23583m == null || numMo23583m.intValue() != iM29946a2) {
                    int iM29946a3 = h7fVar4.m29946a();
                    if (numMo23583m == null || numMo23583m.intValue() != iM29946a3) {
                        int iM29946a4 = h7fVar5.m29946a();
                        if (numMo23583m == null || numMo23583m.intValue() != iM29946a4) {
                            int iM29946a5 = h7fVar6.m29946a();
                            if (numMo23583m == null || numMo23583m.intValue() != iM29946a5) {
                                int iM29946a6 = h7fVar7.m29946a();
                                if (numMo23583m == null || numMo23583m.intValue() != iM29946a6) {
                                    int iM29946a7 = h7fVar8.m29946a();
                                    if (numMo23583m == null || numMo23583m.intValue() != iM29946a7) {
                                        if (numMo23583m == null) {
                                            break;
                                        }
                                        interfaceC12997cMo23579h.skipValue();
                                    } else {
                                        strMo31726i2 = interfaceC12997cMo23579h.mo31726i();
                                    }
                                } else {
                                    strMo31726i6 = interfaceC12997cMo23579h.mo31726i();
                                }
                            } else {
                                gk8VarM28960d = gk8.f25374b.m28960d(interfaceC12997cMo23579h.mo31726i());
                            }
                        } else {
                            strMo31726i5 = interfaceC12997cMo23579h.mo31726i();
                        }
                    } else {
                        strMo31726i4 = interfaceC12997cMo23579h.mo31726i();
                    }
                } else {
                    strMo31726i3 = interfaceC12997cMo23579h.mo31726i();
                }
                h7fVar2 = h7fVar;
            }
            if (strMo31726i != null) {
                lowerCase = strMo31726i.toLowerCase(Locale.ROOT);
                sq8.m48648g(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (!sq8.m48644c(lowerCase, FirebaseAnalytics.Param.SUCCESS) && lowerCase != null) {
                return new w79.C17793a(strMo31726i, strMo31726i2);
            }
            if (strMo31726i3 == null) {
                throw new xr8("missing field `AccessKeyId`", null, 2, null);
            }
            if (strMo31726i4 == null) {
                throw new xr8("missing field `SecretAccessKey`", null, 2, null);
            }
            if (strMo31726i5 == null) {
                throw new xr8("missing field `Token`", null, 2, null);
            }
            if (gk8VarM28960d != null) {
                return new w79.C17794b(strMo31726i3, strMo31726i4, strMo31726i5, gk8VarM28960d, strMo31726i6);
            }
            throw new xr8("missing field `Expiration`", null, 2, null);
        } catch (an5 e) {
            throw new xr8("invalid JSON credentials response", e);
        }
    }

    /* renamed from: b */
    public static final w79 m52408b(dn5 dn5Var) {
        sq8.m48649h(dn5Var, "deserializer");
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("AccessKeyId"));
        h7f h7fVar2 = new h7f(c12163j, new na9("SecretAccessKey"));
        h7f h7fVar3 = new h7f(c12163j, new na9("SessionToken"));
        h7f h7fVar4 = new h7f(aff.C12165l.f14624a, new na9("Expiration"));
        h7f h7fVar5 = new h7f(c12163j, new na9(JsonDocumentFields.VERSION));
        h7f h7fVar6 = new h7f(c12163j, new na9("AccountId"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        c17016a.m49539b(h7fVar6);
        try {
            dn5.InterfaceC12997c interfaceC12997cMo23579h = dn5Var.mo23579h(c17016a.m49538a());
            Integer numValueOf = null;
            String strMo31726i = null;
            String strMo31726i2 = null;
            String strMo31726i3 = null;
            gk8 gk8VarM28960d = null;
            String strMo31726i4 = null;
            while (true) {
                Integer numMo23583m = interfaceC12997cMo23579h.mo23583m();
                int iM29946a = h7fVar.m29946a();
                if (numMo23583m == null || numMo23583m.intValue() != iM29946a) {
                    int iM29946a2 = h7fVar2.m29946a();
                    if (numMo23583m == null || numMo23583m.intValue() != iM29946a2) {
                        int iM29946a3 = h7fVar3.m29946a();
                        if (numMo23583m == null || numMo23583m.intValue() != iM29946a3) {
                            int iM29946a4 = h7fVar4.m29946a();
                            if (numMo23583m == null || numMo23583m.intValue() != iM29946a4) {
                                int iM29946a5 = h7fVar5.m29946a();
                                if (numMo23583m == null || numMo23583m.intValue() != iM29946a5) {
                                    int iM29946a6 = h7fVar6.m29946a();
                                    if (numMo23583m == null || numMo23583m.intValue() != iM29946a6) {
                                        if (numMo23583m == null) {
                                            break;
                                        }
                                        interfaceC12997cMo23579h.skipValue();
                                    } else {
                                        strMo31726i4 = interfaceC12997cMo23579h.mo31726i();
                                    }
                                } else {
                                    numValueOf = Integer.valueOf(interfaceC12997cMo23579h.mo31724b());
                                }
                            } else {
                                gk8VarM28960d = gk8.f25374b.m28960d(interfaceC12997cMo23579h.mo31726i());
                            }
                        } else {
                            strMo31726i3 = interfaceC12997cMo23579h.mo31726i();
                        }
                    } else {
                        strMo31726i2 = interfaceC12997cMo23579h.mo31726i();
                    }
                } else {
                    strMo31726i = interfaceC12997cMo23579h.mo31726i();
                }
            }
            if (strMo31726i == null) {
                throw new xr8("missing field `" + z89.m58938a(h7fVar) + '`', null, 2, null);
            }
            if (strMo31726i2 == null) {
                throw new xr8("missing field `" + z89.m58938a(h7fVar2) + '`', null, 2, null);
            }
            if (strMo31726i3 == null) {
                throw new xr8("missing field `" + z89.m58938a(h7fVar3) + '`', null, 2, null);
            }
            if (numValueOf == null) {
                throw new xr8("missing field `" + z89.m58938a(h7fVar5) + '`', null, 2, null);
            }
            if (numValueOf.intValue() == 1) {
                return new w79.C17794b(strMo31726i, strMo31726i2, strMo31726i3, gk8VarM28960d, strMo31726i4);
            }
            throw new xr8("version " + numValueOf + " is not supported", null, 2, null);
        } catch (an5 e) {
            throw new xr8("invalid JSON credentials response", e);
        }
    }
}
