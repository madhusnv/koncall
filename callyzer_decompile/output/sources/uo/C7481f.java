package uo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.util.Log;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.common.exception.DataNotFoundException;
import fn.C2336i;
import java.util.Iterator;
import java.util.List;
import km.C4120o;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import og.pe;
import pg.f9;
import qw.C6366p;
import qw.a0;
import sq.n2;
import ug.C7439j;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uo.f */
/* loaded from: classes3.dex */
public final class C7481f {

    /* renamed from: a */
    public final C7439j f36116a;

    /* renamed from: b */
    public final C8805t f36117b;

    /* renamed from: c */
    public final Context f36118c;

    /* renamed from: d */
    public final C6366p f36119d = nd.m10782c(new n2(6));

    public C7481f(C7439j c7439j, C8805t c8805t, Context context) {
        this.f36116a = c7439j;
        this.f36117b = c8805t;
        this.f36118c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kn.C4130j m14280a(android.database.Cursor r16, java.lang.String r17) {
        /*
            r15 = this;
            r0 = r16
            java.lang.String r1 = "type"
            int r1 = pg.z8.m11966a(r0, r1)
            r2 = 1
            r3 = 0
            if (r1 == r2) goto L39
            r2 = 2
            if (r1 == r2) goto L36
            r2 = 3
            if (r1 == r2) goto L33
            r2 = 5
            if (r1 == r2) goto L2f
            r2 = 6
            if (r1 == r2) goto L2f
            r2 = 10
            if (r1 == r2) goto L2f
            r2 = 100
            if (r1 == r2) goto L36
            r2 = 101(0x65, float:1.42E-43)
            if (r1 == r2) goto L39
            switch(r1) {
                case 20: goto L2f;
                case 21: goto L2f;
                case 22: goto L2f;
                case 23: goto L2f;
                case 24: goto L2f;
                case 25: goto L2f;
                case 26: goto L2f;
                case 27: goto L2f;
                case 28: goto L2f;
                case 29: goto L2f;
                case 30: goto L2f;
                default: goto L27;
            }
        L27:
            switch(r1) {
                case 49: goto L2f;
                case 50: goto L2f;
                case 51: goto L2f;
                case 52: goto L2f;
                case 53: goto L2f;
                case 54: goto L2f;
                default: goto L2a;
            }
        L2a:
            switch(r1) {
                case 1000: goto L39;
                case 1001: goto L36;
                case 1002: goto L33;
                case 1003: goto L39;
                case 1004: goto L36;
                case 1005: goto L33;
                default: goto L2d;
            }
        L2d:
            r8 = r3
            goto L3c
        L2f:
            zm.d r1 = zm.EnumC8994d.REJECTED
        L31:
            r8 = r1
            goto L3c
        L33:
            zm.d r1 = zm.EnumC8994d.MISSED
            goto L31
        L36:
            zm.d r1 = zm.EnumC8994d.OUTGOING
            goto L31
        L39:
            zm.d r1 = zm.EnumC8994d.INCOMING
            goto L31
        L3c:
            java.lang.String r1 = "name"
            java.lang.String r1 = pg.z8.m11969d(r0, r1)
            yv.f r2 = yv.C8791f.f42457a
            boolean r2 = yv.C8791f.m16170c(r1)
            if (r2 == 0) goto L4e
            java.lang.String r1 = "Unknown"
        L4c:
            r5 = r1
            goto L52
        L4e:
            kotlin.jvm.internal.AbstractC4154l.m8920c(r1)
            goto L4c
        L52:
            java.lang.String r1 = "number"
            int r1 = r0.getColumnIndexOrThrow(r1)
            java.lang.String r6 = r0.getString(r1)
            java.lang.String r1 = "getString(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r6, r1)
            qw.p r1 = r15.f36119d
            java.lang.Object r1 = r1.getValue()
            java.lang.String r2 = "getValue(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r1, r2)
            com.google.i18n.phonenumbers.a r1 = (com.google.i18n.phonenumbers.C1404a) r1
            java.lang.String r2 = "countryiso"
            java.lang.String r2 = pg.z8.m11969d(r0, r2)
            if (r2 == 0) goto L81
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r2.toUpperCase(r3)
            java.lang.String r2 = "toUpperCase(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r3, r2)
        L81:
            int r7 = r1.m4507d(r3)
            yv.o r1 = yv.C8800o.f42459a
            java.lang.String r1 = "date"
            long r1 = pg.z8.m11967b(r0, r1)
            j$.time.LocalDateTime r9 = yv.C8800o.m16182F(r1)
            if (r8 == 0) goto L97
            zm.d r1 = zm.EnumC8994d.MISSED
            if (r8 == r1) goto L9b
        L97:
            zm.d r1 = zm.EnumC8994d.REJECTED
            if (r8 != r1) goto L9e
        L9b:
            r1 = 0
            goto La4
        L9e:
            java.lang.String r1 = "duration"
            long r1 = pg.z8.m11967b(r0, r1)
        La4:
            java.lang.Long r11 = java.lang.Long.valueOf(r1)
            java.lang.String r1 = "_id"
            long r12 = pg.z8.m11967b(r0, r1)
            mm.c r4 = new mm.c
            java.lang.String r10 = ""
            r14 = 2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14)
            kn.j r0 = new kn.j
            r1 = 0
            r2 = r17
            r0.<init>(r4, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.C7481f.m14280a(android.database.Cursor, java.lang.String):kn.j");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qw.C6361k m14281b() {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.C7481f.m14281b():qw.k");
    }

    /* renamed from: c */
    public final void m14282c(int i10, String number) throws DataNotFoundException {
        Context context = this.f36118c;
        AbstractC4154l.m8923f(number, "number");
        C8805t c8805t = this.f36117b;
        c8805t.m16232g("SIMVerificationUseCase", "placeCall >>> Attempting to place call to number: " + number + " with simPos: " + i10);
        try {
            Object systemService = context.getSystemService("telecom");
            AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.telecom.TelecomManager");
            List<PhoneAccountHandle> callCapablePhoneAccounts = ((TelecomManager) systemService).getCallCapablePhoneAccounts();
            c8805t.m16232g("SIMVerificationUseCase", "placeCall >>> Retrieved phoneAccountHandles: " + (callCapablePhoneAccounts != null ? callCapablePhoneAccounts.size() : 0));
            Intent flags = new Intent("android.intent.action.CALL").setFlags(268435456);
            AbstractC4154l.m8922e(flags, "setFlags(...)");
            flags.setData(Uri.parse("tel:".concat(number)));
            flags.putExtra("com.android.phone.force.slot", true);
            flags.putExtra("Cdma_Supp", true);
            Iterator it = pe.m10834i("extra_asus_dial_use_dualsim", "com.android.phone.extra.slot", "slot", "simslot", "sim_slot", "subscription", "Subscription", "phone", "com.android.phone.DialingMode", "simSlot", "slot_id", "simId", "simnum", "phone_type", "slotId", "slotIdx", "call_card", "dial_mode", "original_slot_id", "originalSlot").iterator();
            while (it.hasNext()) {
                flags.putExtra((String) it.next(), i10);
            }
            if (callCapablePhoneAccounts == null || callCapablePhoneAccounts.size() < i10) {
                c8805t.m16232g("SIMVerificationUseCase", "placeCall >>> phoneAccountHandles is null or simPos out of bounds.");
                throw new DataNotFoundException(f9.m11628b(context, R.string.something_went_wrong));
            }
            try {
                AbstractC4154l.m8920c(flags.putExtra("android.telecom.extra.PHONE_ACCOUNT_HANDLE", callCapablePhoneAccounts.get(i10)));
            } catch (Exception e2) {
                c8805t.m16232g("SIMVerificationUseCase", "placeCall >>> Exception while simPos: " + i10 + " , adding PHONE_ACCOUNT_HANDLE: " + e2.getLocalizedMessage());
                e2.printStackTrace();
            }
            if (flags.resolveActivity(context.getPackageManager()) == null) {
                c8805t.m16232g("SIMVerificationUseCase", "placeCall >>> Call intent could not be resolved.");
                throw new DataNotFoundException(f9.m11628b(context, R.string.call_intent_error));
            }
            c8805t.m16232g("SIMVerificationUseCase", "placeCall >>> Intent resolved, starting activity.");
            context.startActivity(flags);
        } catch (Exception e10) {
            String localizedMessage = e10.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = Log.getStackTraceString(e10);
                AbstractC4154l.m8922e(localizedMessage, "getStackTraceString(...)");
            }
            c8805t.m16232g("SIMVerificationUseCase", "placeCall >>> Exception: ".concat(localizedMessage));
            e10.printStackTrace();
            throw new DataNotFoundException(f9.m11628b(context, R.string.something_went_wrong));
        }
    }

    /* renamed from: d */
    public final Object m14283d(boolean z6, AbstractC8193c abstractC8193c) {
        Object objM8887i = ((C4120o) ((C2336i) this.f36116a.f35537b).f10585a).m8887i("call_verification", z6, abstractC8193c);
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        a0 a0Var = a0.f30746a;
        if (objM8887i != enumC7794a) {
            objM8887i = a0Var;
        }
        if (objM8887i != enumC7794a) {
            objM8887i = a0Var;
        }
        return objM8887i == enumC7794a ? objM8887i : a0Var;
    }
}
