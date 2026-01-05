package p001o;

import ai.salesmax.model.AttendanceSummary;
import ai.salesmax.model.LeadsUser;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.AbstractC2145n;
import com.amplifyframework.core.model.temporal.Temporal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p001o.yne;

/* loaded from: classes.dex */
public final class hx0 extends zf0 {

    /* renamed from: o.hx0$a */
    public static final class C14113a extends jgg implements nl7 {

        /* renamed from: a */
        public int f27724a;

        /* renamed from: b */
        public /* synthetic */ Object f27725b;

        /* renamed from: c */
        public final /* synthetic */ Date f27726c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14113a(Date date, n64 n64Var) {
            super(2, n64Var);
            this.f27726c = date;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14113a c14113a = new C14113a(this.f27726c, n64Var);
            c14113a.f27725b = obj;
            return c14113a;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14113a) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(1:(3:(1:(1:7)(2:8|9))(3:10|48|11)|44|45)(1:15))(2:16|(1:18))|46|19|(2:22|20)|50|23|(4:26|(3:52|28|55)(1:54)|53|24)|51|29|(2:32|30)|56|33|(1:35)|44|45|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0100, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0101, code lost:
        
            r0 = r15;
            r15 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x010d, code lost:
        
            r15 = "Error Occurred!";
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0121, code lost:
        
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0121 A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            int i = this.f27724a;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f27725b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f27725b = ogaVar;
                this.f27724a = 1;
                if (ogaVar.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        oga ogaVar2 = (oga) this.f27725b;
                        try {
                            wre.m54934b(obj);
                        } catch (Exception e) {
                            Exception e2 = e;
                            yne.C18447a c18447a = yne.f55736e;
                            String message = e2.getMessage();
                            if (message == null) {
                            }
                            yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                            this.f27725b = null;
                            this.f27724a = 3;
                            if (ogaVar2.emit(yneVarM58027b, this) == objM51918f) {
                            }
                            return y3i.f54824a;
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                    }
                    return y3i.f54824a;
                }
                oga ogaVar3 = (oga) this.f27725b;
                wre.m54934b(obj);
                ogaVar = ogaVar3;
            }
            Object objM55727f = ww0.m55282r(this.f27726c).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            List list = (List) objM55727f;
            ArrayList arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((AttendanceSummary) it.next()).getUserId());
            }
            Set setV0 = kh3.V0(arrayList);
            Collection collectionM37619T = lpi.m37619T();
            sq8.m48648g(collectionM37619T, "getAllUsers(...)");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : collectionM37619T) {
                if (!setV0.contains(((LeadsUser) obj2).getId())) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(dh3.m23088v(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((LeadsUser) it2.next()).getId());
            }
            Object objM55727f2 = ww0.m55284t(arrayList3, this.f27726c).m55727f();
            sq8.m48648g(objM55727f2, "blockingFirst(...)");
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(list);
            arrayList4.addAll((List) objM55727f2);
            yne yneVarM58030d = yne.f55736e.m58030d(arrayList4);
            this.f27725b = ogaVar;
            this.f27724a = 2;
            if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.hx0$b */
    public static final class C14114b extends jgg implements nl7 {

        /* renamed from: a */
        public int f27727a;

        /* renamed from: b */
        public /* synthetic */ Object f27728b;

        /* renamed from: c */
        public final /* synthetic */ String f27729c;

        /* renamed from: d */
        public final /* synthetic */ Date f27730d;

        /* renamed from: e */
        public final /* synthetic */ Date f27731e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14114b(String str, Date date, Date date2, n64 n64Var) {
            super(2, n64Var);
            this.f27729c = str;
            this.f27730d = date;
            this.f27731e = date2;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14114b c14114b = new C14114b(this.f27729c, this.f27730d, this.f27731e, n64Var);
            c14114b.f27728b = obj;
            return c14114b;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14114b) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [o.oga] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f27727a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f27728b = null;
                this.f27727a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f27728b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f27728b = ogaVar2;
                this.f27727a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                        return y3i.f54824a;
                    }
                    oga ogaVar3 = (oga) this.f27728b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f27728b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            yne yneVarM58030d = yne.f55736e.m58030d(ww0.m55283s(this.f27729c, this.f27730d, this.f27731e));
            this.f27728b = ogaVar;
            this.f27727a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.hx0$c */
    public static final class C14115c extends jgg implements nl7 {

        /* renamed from: a */
        public int f27732a;

        /* renamed from: b */
        public /* synthetic */ Object f27733b;

        /* renamed from: c */
        public final /* synthetic */ boolean f27734c;

        /* renamed from: d */
        public final /* synthetic */ Uri f27735d;

        /* renamed from: e */
        public final /* synthetic */ String f27736e;

        /* renamed from: f */
        public final /* synthetic */ Context f27737f;

        /* renamed from: o.hx0$c$a */
        public static final class a implements rl7 {

            /* renamed from: a */
            public final /* synthetic */ boolean f27738a;

            /* renamed from: b */
            public final /* synthetic */ Uri f27739b;

            /* renamed from: c */
            public final /* synthetic */ String f27740c;

            /* renamed from: d */
            public final /* synthetic */ Context f27741d;

            public a(boolean z, Uri uri, String str, Context context) {
                this.f27738a = z;
                this.f27739b = uri;
                this.f27740c = str;
                this.f27741d = context;
            }

            @Override // p001o.rl7
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AttendanceSummary apply(AttendanceSummary attendanceSummary) {
                Long lM16645F;
                sq8.m48649h(attendanceSummary, "it");
                HashMap map = new HashMap();
                map.put("accountId", attendanceSummary.getAccountId());
                map.put("userId", attendanceSummary.getUserId());
                map.put("updateProfilePicUrl", String.valueOf(this.f27738a));
                map.put("capturedImageUri", this.f27739b.toString());
                map.put("capturedImageName", this.f27740c);
                map.put("attendanceId", attendanceSummary.getId());
                String dateTimeOfAttendance = attendanceSummary.getDateTimeOfAttendance();
                String strValueOf = (dateTimeOfAttendance == null || (lM16645F = a81.m16645F(new Temporal.DateTime(dateTimeOfAttendance))) == null) ? null : String.valueOf(lM16645F);
                if (strValueOf == null) {
                    strValueOf = "";
                }
                map.put("dateTimeOfAttendanceInMillis", strValueOf);
                w60.m53996b().m53998d(this.f27741d, u60.UPLOAD_IMAGE_POST_ATTENDANCE.getWorkType(), attendanceSummary.getId(), map);
                return attendanceSummary;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14115c(boolean z, Uri uri, String str, Context context, n64 n64Var) {
            super(2, n64Var);
            this.f27734c = z;
            this.f27735d = uri;
            this.f27736e = str;
            this.f27737f = context;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14115c c14115c = new C14115c(this.f27734c, this.f27735d, this.f27736e, this.f27737f, n64Var);
            c14115c.f27733b = obj;
            return c14115c;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14115c) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [o.oga] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f27732a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f27733b = null;
                this.f27732a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f27733b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f27733b = ogaVar2;
                this.f27732a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                        return y3i.f54824a;
                    }
                    oga ogaVar3 = (oga) this.f27733b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f27733b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = ww0.m55262L(null).d0(new a(this.f27734c, this.f27735d, this.f27736e, this.f27737f)).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((AttendanceSummary) objM55727f);
            this.f27733b = ogaVar;
            this.f27732a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.hx0$d */
    public static final class C14116d extends jgg implements nl7 {

        /* renamed from: a */
        public int f27742a;

        /* renamed from: b */
        public /* synthetic */ Object f27743b;

        /* renamed from: c */
        public final /* synthetic */ Long f27744c;

        /* renamed from: d */
        public final /* synthetic */ Long f27745d;

        /* renamed from: e */
        public final /* synthetic */ String f27746e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14116d(Long l, Long l2, String str, n64 n64Var) {
            super(2, n64Var);
            this.f27744c = l;
            this.f27745d = l2;
            this.f27746e = str;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14116d c14116d = new C14116d(this.f27744c, this.f27745d, this.f27746e, n64Var);
            c14116d.f27743b = obj;
            return c14116d;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14116d) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(3:(1:(1:7)(2:8|9))(3:10|59|11)|57|58)(1:15))(2:16|(1:18))|61|19|(1:21)(1:22)|23|(7:25|(1:27)|28|(1:34)(1:33)|(2:36|(1:45)(2:(1:42)|(1:44)(0)))|46|(1:48))(0)|57|58|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00f9, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
        
            r0 = r14;
            r14 = r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ab A[Catch: Exception -> 0x00f9, TryCatch #1 {Exception -> 0x00f9, blocks: (B:19:0x004e, B:21:0x0052, B:23:0x0064, B:25:0x0068, B:28:0x0076, B:30:0x007b, B:36:0x0087, B:39:0x008f, B:44:0x0099, B:45:0x00ab, B:46:0x00c4), top: B:61:0x004e }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x011a A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            int i = this.f27742a;
            boolean z = true;
            if (i == 0) {
                wre.m54934b(obj);
                ogaVar = (oga) this.f27743b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f27743b = ogaVar;
                this.f27742a = 1;
                if (ogaVar.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        oga ogaVar2 = (oga) this.f27743b;
                        try {
                            wre.m54934b(obj);
                        } catch (Exception e) {
                            Exception e2 = e;
                            yne.C18447a c18447a = yne.f55736e;
                            String message = e2.getMessage();
                            if (message == null) {
                                message = "Error Occurred!";
                            }
                            yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                            this.f27743b = null;
                            this.f27742a = 3;
                            if (ogaVar2.emit(yneVarM58027b, this) == objM51918f) {
                                return objM51918f;
                            }
                            return y3i.f54824a;
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                    }
                    return y3i.f54824a;
                }
                oga ogaVar3 = (oga) this.f27743b;
                wre.m54934b(obj);
                ogaVar = ogaVar3;
            }
            Long l = this.f27744c;
            String strM16654i = l != null ? a81.m16654i(a81.m16658m(ml1.m39305e(l.longValue()))) : null;
            Long l2 = this.f27745d;
            if (l2 != null) {
                l2.longValue();
                String strM16654i2 = a81.m16654i(a81.m16658m(l2));
                if (strM16654i2 == null) {
                    strM16654i2 = strM16654i;
                }
                String str = this.f27746e;
                if (str == null || f9g.d0(str)) {
                    if (sq8.m48644c(strM16654i, strM16654i2)) {
                        if (str != null && !f9g.d0(str)) {
                            z = false;
                        }
                        if (z) {
                            str = "I'm out of office on " + strM16654i;
                        }
                    } else {
                        str = "I'm out of office from " + strM16654i + " to " + strM16654i2;
                    }
                }
                Object objM55727f = ww0.m55285u(ml1.m39305e(10000L)).m55727f();
                sq8.m48648g(objM55727f, "blockingFirst(...)");
                Object objM55727f2 = ww0.m55263M(this.f27744c, this.f27745d, str).m55727f();
                sq8.m48648g(objM55727f2, "blockingFirst(...)");
                yne yneVarM58030d = yne.f55736e.m58030d((List) objM55727f2);
                this.f27743b = ogaVar;
                this.f27742a = 2;
                if (ogaVar.emit(yneVarM58030d, this) == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.hx0$e */
    public static final class C14117e extends jgg implements nl7 {

        /* renamed from: a */
        public int f27747a;

        /* renamed from: b */
        public /* synthetic */ Object f27748b;

        /* renamed from: c */
        public final /* synthetic */ AttendanceSummary f27749c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14117e(AttendanceSummary attendanceSummary, n64 n64Var) {
            super(2, n64Var);
            this.f27749c = attendanceSummary;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C14117e c14117e = new C14117e(this.f27749c, n64Var);
            c14117e.f27748b = obj;
            return c14117e;
        }

        @Override // p001o.nl7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(oga ogaVar, n64 n64Var) {
            return ((C14117e) create(ogaVar, n64Var)).invokeSuspend(y3i.f54824a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [o.oga] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v7 */
        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            oga ogaVar;
            Object objM51918f = uq8.m51918f();
            ?? r1 = this.f27747a;
            try {
            } catch (Exception e) {
                yne.C18447a c18447a = yne.f55736e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Error Occurred!";
                }
                yne yneVarM58027b = yne.C18447a.m58027b(c18447a, null, message, null, 4, null);
                this.f27748b = null;
                this.f27747a = 3;
                if (r1.emit(yneVarM58027b, this) == objM51918f) {
                    return objM51918f;
                }
            }
            if (r1 == 0) {
                wre.m54934b(obj);
                oga ogaVar2 = (oga) this.f27748b;
                yne yneVarM58029c = yne.f55736e.m58029c(null);
                this.f27748b = ogaVar2;
                this.f27747a = 1;
                if (ogaVar2.emit(yneVarM58029c, this) == objM51918f) {
                    return objM51918f;
                }
                ogaVar = ogaVar2;
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        if (r1 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                        return y3i.f54824a;
                    }
                    oga ogaVar3 = (oga) this.f27748b;
                    wre.m54934b(obj);
                    r1 = ogaVar3;
                    return y3i.f54824a;
                }
                oga ogaVar4 = (oga) this.f27748b;
                wre.m54934b(obj);
                ogaVar = ogaVar4;
            }
            Object objM55727f = ww0.m55264N(this.f27749c).m55727f();
            sq8.m48648g(objM55727f, "blockingFirst(...)");
            yne yneVarM58030d = yne.f55736e.m58030d((AttendanceSummary) objM55727f);
            this.f27748b = ogaVar;
            this.f27747a = 2;
            Object objEmit = ogaVar.emit(yneVarM58030d, this);
            r1 = ogaVar;
            if (objEmit == objM51918f) {
                return objM51918f;
            }
            return y3i.f54824a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx0(Application application) {
        super(application);
        sq8.m48649h(application, "application");
    }

    /* renamed from: k */
    public static /* synthetic */ AbstractC2145n m31251k(hx0 hx0Var, Long l, Long l2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            l2 = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return hx0Var.m31255j(l, l2, str);
    }

    /* renamed from: g */
    public final AbstractC2145n m31252g(Date date) {
        sq8.m48649h(date, "onDate");
        return e84.m24521b(eu5.m25611b(), 0L, new C14113a(date, null), 2, null);
    }

    /* renamed from: h */
    public final AbstractC2145n m31253h(String str, Date date, Date date2) {
        sq8.m48649h(date, "fromDate");
        sq8.m48649h(date2, "toDate");
        return e84.m24521b(eu5.m25611b(), 0L, new C14114b(str, date, date2, null), 2, null);
    }

    /* renamed from: i */
    public final AbstractC2145n m31254i(Context context, Uri uri, String str, boolean z) {
        sq8.m48649h(context, "context");
        sq8.m48649h(uri, "biometricPicUri");
        sq8.m48649h(str, "biometricPicName");
        return e84.m24521b(eu5.m25611b(), 0L, new C14115c(z, uri, str, context, null), 2, null);
    }

    /* renamed from: j */
    public final AbstractC2145n m31255j(Long l, Long l2, String str) {
        return e84.m24521b(eu5.m25611b(), 0L, new C14116d(l, l2, str, null), 2, null);
    }

    /* renamed from: l */
    public final AbstractC2145n m31256l(AttendanceSummary attendanceSummary) {
        sq8.m48649h(attendanceSummary, "attendanceSummary");
        return e84.m24521b(eu5.m25611b(), 0L, new C14117e(attendanceSummary, null), 2, null);
    }
}
