package yn;

import com.websoptimization.callyzerbiz.domain.model.FCMData;
import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import om.C5405g;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import xm.l2;
import yv.C8800o;
import yv.C8805t;
import zm.EnumC8992b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yn.g */
/* loaded from: classes3.dex */
public final class C8709g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f42094a;

    /* renamed from: b */
    public String f42095b;

    /* renamed from: c */
    public String f42096c;

    /* renamed from: d */
    public String f42097d;

    /* renamed from: e */
    public int f42098e;

    /* renamed from: f */
    public final /* synthetic */ FCMData f42099f;

    /* renamed from: g */
    public final /* synthetic */ C8716n f42100g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8709g(int i10, FCMData fCMData, InterfaceC7559c interfaceC7559c, C8716n c8716n) {
        super(2, interfaceC7559c);
        this.f42094a = i10;
        this.f42099f = fCMData;
        this.f42100g = c8716n;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f42094a) {
            case 0:
                return new C8709g(0, this.f42099f, interfaceC7559c, this.f42100g);
            default:
                return new C8709g(1, this.f42099f, interfaceC7559c, this.f42100g);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f42094a) {
        }
        return ((C8709g) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM15590f;
        String str;
        String str2;
        String str3;
        String noteTemplateDescription;
        String noteTemplateTitle;
        String str4;
        Object objM15595k;
        int i10 = this.f42094a;
        FCMData fCMData = this.f42099f;
        C8716n c8716n = this.f42100g;
        a0 a0Var = a0.f30746a;
        switch (i10) {
            case 0:
                C8805t c8805t = c8716n.f42156n;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f42098e;
                try {
                    if (i11 == 0) {
                        od.m10798c(obj);
                        String noteTemplateId = fCMData.getNoteTemplateId();
                        AbstractC4154l.m8920c(noteTemplateId);
                        String noteTemplateDescription2 = fCMData.getNoteTemplateDescription();
                        AbstractC4154l.m8920c(noteTemplateDescription2);
                        String noteTemplateTitle2 = fCMData.getNoteTemplateTitle();
                        AbstractC4154l.m8920c(noteTemplateTitle2);
                        C8800o c8800o = C8800o.f42459a;
                        String noteTemplateCreatedDateTime = fCMData.getNoteTemplateCreatedDateTime();
                        AbstractC4154l.m8920c(noteTemplateCreatedDateTime);
                        LocalDateTime localDateTimeM16198g = C8800o.m16198g(C8800o.m16183G(noteTemplateCreatedDateTime));
                        String noteTemplateModifyDateTime = fCMData.getNoteTemplateModifyDateTime();
                        C5405g c5405g = new C5405g(0, noteTemplateTitle2, noteTemplateDescription2, true, noteTemplateModifyDateTime != null ? C8800o.m16198g(C8800o.m16183G(noteTemplateModifyDateTime)) : null, localDateTimeM16198g, EnumC8992b.TEMPLATE_DONE, 0, noteTemplateId, "");
                        l2 l2Var = c8716n.f42150h;
                        this.f42095b = noteTemplateId;
                        this.f42096c = noteTemplateDescription2;
                        this.f42097d = noteTemplateTitle2;
                        this.f42098e = 1;
                        objM15590f = l2Var.m15590f(c5405g, this);
                        if (objM15590f == enumC7794a) {
                            return enumC7794a;
                        }
                        str = noteTemplateId;
                        str2 = noteTemplateTitle2;
                        str3 = noteTemplateDescription2;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = this.f42097d;
                        str3 = this.f42096c;
                        String str5 = this.f42095b;
                        od.m10798c(obj);
                        str = str5;
                        objM15590f = obj;
                    }
                    if (((Boolean) objM15590f).booleanValue()) {
                        return a0Var;
                    }
                    c8805t.m16232g("CallNote Template insertion Notification DB operation failed", str + "  " + str2 + " " + str3 + " ");
                    return a0Var;
                } catch (Exception e2) {
                    c8805t.m16231f("Error fetching Call Note Template: " + e2);
                    return a0Var;
                }
            default:
                C8805t c8805t2 = c8716n.f42156n;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f42098e;
                try {
                    if (i12 == 0) {
                        od.m10798c(obj);
                        String noteTemplateId2 = fCMData.getNoteTemplateId();
                        AbstractC4154l.m8920c(noteTemplateId2);
                        noteTemplateDescription = fCMData.getNoteTemplateDescription();
                        AbstractC4154l.m8920c(noteTemplateDescription);
                        noteTemplateTitle = fCMData.getNoteTemplateTitle();
                        AbstractC4154l.m8920c(noteTemplateTitle);
                        C8800o c8800o2 = C8800o.f42459a;
                        String noteTemplateCreatedDateTime2 = fCMData.getNoteTemplateCreatedDateTime();
                        AbstractC4154l.m8920c(noteTemplateCreatedDateTime2);
                        LocalDateTime localDateTimeM16198g2 = C8800o.m16198g(C8800o.m16183G(noteTemplateCreatedDateTime2));
                        String noteTemplateModifyDateTime2 = fCMData.getNoteTemplateModifyDateTime();
                        AbstractC4154l.m8920c(noteTemplateModifyDateTime2);
                        LocalDateTime localDateTimeM16198g3 = C8800o.m16198g(C8800o.m16183G(noteTemplateModifyDateTime2));
                        l2 l2Var2 = c8716n.f42150h;
                        this.f42095b = noteTemplateId2;
                        this.f42096c = noteTemplateDescription;
                        this.f42097d = noteTemplateTitle;
                        this.f42098e = 1;
                        str4 = noteTemplateId2;
                        objM15595k = l2Var2.m15595k(noteTemplateTitle, noteTemplateDescription, localDateTimeM16198g3, str4, localDateTimeM16198g2, this);
                        if (objM15595k == enumC7794a2) {
                            return enumC7794a2;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str6 = this.f42097d;
                        String str7 = this.f42096c;
                        String str8 = this.f42095b;
                        od.m10798c(obj);
                        str4 = str8;
                        noteTemplateDescription = str7;
                        noteTemplateTitle = str6;
                        objM15595k = obj;
                    }
                    if (((Boolean) objM15595k).booleanValue()) {
                        return a0Var;
                    }
                    c8805t2.m16232g("CallNote Template Update Notification DB operation failed", str4 + "  " + noteTemplateTitle + " " + noteTemplateDescription + " ");
                    return a0Var;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    c8805t2.m16231f("Error fetching Call Note Template: " + a0Var);
                    return a0Var;
                }
        }
    }
}
