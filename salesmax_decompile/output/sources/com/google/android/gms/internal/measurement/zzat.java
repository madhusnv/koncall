package com.google.android.gms.internal.measurement;

import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.datastore.storage.sqlite.SQLiteCommandFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.message.TokenParser;

/* loaded from: classes3.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzat) {
            return this.zza.equals(((zzat) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        return ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + this.zza + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0167  */
    @Override // com.google.android.gms.internal.measurement.zzap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzap zzbR(String str, zzg zzgVar, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        char c;
        zzat zzatVar;
        int i;
        zzap zzahVar;
        int i2;
        int i3;
        zzg zzgVar2;
        int iZza;
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !"match".equals(str) && !"replace".equals(str) && !FirebaseAnalytics.Event.SEARCH.equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                str3 = "hasOwnProperty";
                if (!"trim".equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
            }
            switch (str.hashCode()) {
                case -1789698943:
                    str4 = "charAt";
                    str5 = str3;
                    str6 = "toString";
                    if (str.equals(str5)) {
                        c = 2;
                        break;
                    } else {
                        c = 65535;
                        break;
                    }
                case -1776922004:
                    str4 = "charAt";
                    str6 = "toString";
                    if (str.equals(str6)) {
                        c = 14;
                        str5 = str3;
                        break;
                    } else {
                        str5 = str3;
                        c = 65535;
                        break;
                    }
                case -1464939364:
                    str4 = "charAt";
                    if (str.equals("toLocaleLowerCase")) {
                        c = '\f';
                        str5 = str3;
                        str6 = "toString";
                        break;
                    }
                    str5 = str3;
                    str6 = "toString";
                    c = 65535;
                    break;
                case -1361633751:
                    str4 = "charAt";
                    if (str.equals(str4)) {
                        str5 = str3;
                        str6 = "toString";
                        c = 0;
                        break;
                    }
                    str5 = str3;
                    str6 = "toString";
                    c = 65535;
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        str4 = "charAt";
                        str5 = str3;
                        str6 = "toString";
                        c = 1;
                        break;
                    }
                    str4 = "charAt";
                    str5 = str3;
                    str6 = "toString";
                    c = 65535;
                    break;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        c = TokenParser.CR;
                        str4 = "charAt";
                        str5 = str3;
                        str6 = "toString";
                        break;
                    }
                    str4 = "charAt";
                    str5 = str3;
                    str6 = "toString";
                    c = 65535;
                    break;
                case -906336856:
                    if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                        c = 7;
                        str4 = "charAt";
                        str5 = str3;
                        str6 = "toString";
                        break;
                    }
                    str4 = "charAt";
                    str5 = str3;
                    str6 = "toString";
                    c = 65535;
                    break;
                case -726908483:
                    if (str.equals(str2)) {
                        c = 11;
                        str4 = "charAt";
                        str5 = str3;
                        str6 = "toString";
                        break;
                    }
                    str4 = "charAt";
                    str5 = str3;
                    str6 = "toString";
                    c = 65535;
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        c = 4;
                        str4 = "charAt";
                        str5 = str3;
                        str6 = "toString";
                        break;
                    }
                    str4 = "charAt";
                    str5 = str3;
                    str6 = "toString";
                    c = 65535;
                    break;
                case -399551817:
                    if (str.equals("toUpperCase")) {
                        c = 15;
                        str4 = "charAt";
                        str5 = str3;
                        str6 = "toString";
                        break;
                    }
                    str4 = "charAt";
                    str5 = str3;
                    str6 = "toString";
                    c = 65535;
                    break;
                case 3568674:
                    if (str.equals("trim")) {
                        c = 16;
                        str4 = "charAt";
                        str5 = str3;
                        str6 = "toString";
                        break;
                    }
                    str4 = "charAt";
                    str5 = str3;
                    str6 = "toString";
                    c = 65535;
                    break;
                case 103668165:
                    if (str.equals("match")) {
                        c = 5;
                        str4 = "charAt";
                        str5 = str3;
                        str6 = "toString";
                        break;
                    }
                    str4 = "charAt";
                    str5 = str3;
                    str6 = "toString";
                    c = 65535;
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        c = '\b';
                        str4 = "charAt";
                        str5 = str3;
                        str6 = "toString";
                        break;
                    }
                    str4 = "charAt";
                    str5 = str3;
                    str6 = "toString";
                    c = 65535;
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        c = '\t';
                        str4 = "charAt";
                        str5 = str3;
                        str6 = "toString";
                        break;
                    }
                    str4 = "charAt";
                    str5 = str3;
                    str6 = "toString";
                    c = 65535;
                    break;
                case 530542161:
                    if (str.equals("substring")) {
                        c = '\n';
                        str4 = "charAt";
                        str5 = str3;
                        str6 = "toString";
                        break;
                    }
                    str4 = "charAt";
                    str5 = str3;
                    str6 = "toString";
                    c = 65535;
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        c = 6;
                        str4 = "charAt";
                        str5 = str3;
                        str6 = "toString";
                        break;
                    }
                    str4 = "charAt";
                    str5 = str3;
                    str6 = "toString";
                    c = 65535;
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        c = 3;
                        str4 = "charAt";
                        str5 = str3;
                        str6 = "toString";
                        break;
                    }
                    str4 = "charAt";
                    str5 = str3;
                    str6 = "toString";
                    c = 65535;
                    break;
                default:
                    str4 = "charAt";
                    str5 = str3;
                    str6 = "toString";
                    c = 65535;
                    break;
            }
            String strZzi = SQLiteCommandFactory.UNDEFINED;
            String str7 = str5;
            String str8 = str4;
            switch (c) {
                case 0:
                    zzh.zzj(str8, 1, list);
                    int iZza2 = !list.isEmpty() ? (int) zzh.zza(zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue()) : 0;
                    String str9 = this.zza;
                    return (iZza2 < 0 || iZza2 >= str9.length()) ? zzap.zzm : new zzat(String.valueOf(str9.charAt(iZza2)));
                case 1:
                    zzatVar = this;
                    if (!list.isEmpty()) {
                        StringBuilder sb = new StringBuilder(zzatVar.zza);
                        for (int i4 = 0; i4 < list.size(); i4++) {
                            sb.append(zzgVar.zzb((zzap) list.get(i4)).zzi());
                        }
                        return new zzat(sb.toString());
                    }
                    return zzatVar;
                case 2:
                    zzh.zzh(str7, 1, list);
                    String str10 = this.zza;
                    zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(0));
                    if ("length".equals(zzapVarZzb.zzi())) {
                        return zzap.zzk;
                    }
                    double dDoubleValue = zzapVarZzb.zzh().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str10.length()) ? zzap.zzl : zzap.zzk;
                case 3:
                    zzh.zzj("indexOf", 2, list);
                    String str11 = this.zza;
                    if (list.size() > 0) {
                        strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                    }
                    zzahVar = new zzah(Double.valueOf(str11.indexOf(strZzi, (int) zzh.zza(list.size() < 2 ? 0.0d : zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()))));
                    return zzahVar;
                case 4:
                    zzh.zzj("lastIndexOf", 2, list);
                    String str12 = this.zza;
                    if (list.size() > 0) {
                        strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                    }
                    String str13 = strZzi;
                    zzahVar = new zzah(Double.valueOf(str12.lastIndexOf(str13, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) ? Double.POSITIVE_INFINITY : zzh.zza(r1)))));
                    return zzahVar;
                case 5:
                    zzh.zzj("match", 1, list);
                    Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzgVar.zzb((zzap) list.get(0)).zzi()).matcher(this.zza);
                    return matcher.find() ? new zzae(Arrays.asList(new zzat(matcher.group()))) : zzap.zzg;
                case 6:
                    zzatVar = this;
                    zzh.zzj("replace", 2, list);
                    zzap zzapVarZza = zzap.zzf;
                    if (!list.isEmpty()) {
                        strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                        if (list.size() > 1) {
                            zzapVarZza = zzgVar.zzb((zzap) list.get(1));
                        }
                    }
                    String str14 = strZzi;
                    String str15 = zzatVar.zza;
                    int iIndexOf = str15.indexOf(str14);
                    if (iIndexOf >= 0) {
                        if (zzapVarZza instanceof zzai) {
                            zzapVarZza = ((zzai) zzapVarZza).zza(zzgVar, Arrays.asList(new zzat(str14), new zzah(Double.valueOf(iIndexOf)), zzatVar));
                        }
                        zzahVar = new zzat(str15.substring(0, iIndexOf) + zzapVarZza.zzi() + str15.substring(iIndexOf + str14.length()));
                        return zzahVar;
                    }
                    return zzatVar;
                case 7:
                    zzh.zzj(FirebaseAnalytics.Event.SEARCH, 1, list);
                    if (!list.isEmpty()) {
                        strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
                    }
                    return Pattern.compile(strZzi).matcher(this.zza).find() ? new zzah(Double.valueOf(r1.start())) : new zzah(Double.valueOf(-1.0d));
                case '\b':
                    zzh.zzj("slice", 2, list);
                    String str16 = this.zza;
                    double dZza = zzh.zza(!list.isEmpty() ? zzgVar.zzb((zzap) list.get(0)).zzh().doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    int iMax = (int) (dZza < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.max(str16.length() + dZza, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : Math.min(dZza, str16.length()));
                    double dZza2 = zzh.zza(list.size() > 1 ? zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue() : str16.length());
                    zzahVar = new zzat(str16.substring(iMax, Math.max(0, ((int) (dZza2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.max(str16.length() + dZza2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : Math.min(dZza2, str16.length()))) - iMax) + iMax));
                    return zzahVar;
                case '\t':
                    zzh.zzj("split", 2, list);
                    String str17 = this.zza;
                    if (str17.length() == 0) {
                        return new zzae(Arrays.asList(this));
                    }
                    ArrayList arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        String strZzi2 = zzgVar.zzb((zzap) list.get(0)).zzi();
                        long jZzd = list.size() > 1 ? zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) : 2147483647L;
                        if (jZzd == 0) {
                            return new zzae();
                        }
                        String[] strArrSplit = str17.split(Pattern.quote(strZzi2), ((int) jZzd) + 1);
                        int length = strArrSplit.length;
                        if (!strZzi2.isEmpty() || length <= 0) {
                            i2 = length;
                            i3 = 0;
                        } else {
                            boolean zIsEmpty = strArrSplit[0].isEmpty();
                            i2 = length - 1;
                            i3 = zIsEmpty;
                            if (!strArrSplit[i2].isEmpty()) {
                                i2 = length;
                                i3 = zIsEmpty;
                            }
                        }
                        if (length > jZzd) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList.add(new zzat(strArrSplit[i3]));
                            i3++;
                        }
                    }
                    return new zzae(arrayList);
                case '\n':
                    zzh.zzj("substring", 2, list);
                    String str18 = this.zza;
                    if (list.isEmpty()) {
                        zzgVar2 = zzgVar;
                        iZza = 0;
                    } else {
                        zzgVar2 = zzgVar;
                        iZza = (int) zzh.zza(zzgVar2.zzb((zzap) list.get(0)).zzh().doubleValue());
                    }
                    int iZza3 = list.size() > 1 ? (int) zzh.zza(zzgVar2.zzb((zzap) list.get(1)).zzh().doubleValue()) : str18.length();
                    int iMin = Math.min(Math.max(iZza, 0), str18.length());
                    int iMin2 = Math.min(Math.max(iZza3, 0), str18.length());
                    zzahVar = new zzat(str18.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                    return zzahVar;
                case 11:
                    zzh.zzh(str2, 0, list);
                    return new zzat(this.zza.toUpperCase());
                case '\f':
                    zzh.zzh("toLocaleLowerCase", 0, list);
                    return new zzat(this.zza.toLowerCase());
                case '\r':
                    zzh.zzh("toLowerCase", 0, list);
                    return new zzat(this.zza.toLowerCase(Locale.ENGLISH));
                case 14:
                    zzatVar = this;
                    zzh.zzh(str6, 0, list);
                    return zzatVar;
                case 15:
                    zzh.zzh("toUpperCase", 0, list);
                    return new zzat(this.zza.toUpperCase(Locale.ENGLISH));
                case 16:
                    zzh.zzh("toUpperCase", 0, list);
                    return new zzat(this.zza.trim());
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        str2 = "toLocaleUpperCase";
        str3 = "hasOwnProperty";
        switch (str.hashCode()) {
            case -1789698943:
                break;
            case -1776922004:
                break;
            case -1464939364:
                break;
            case -1361633751:
                break;
            case -1354795244:
                break;
            case -1137582698:
                break;
            case -906336856:
                break;
            case -726908483:
                break;
            case -467511597:
                break;
            case -399551817:
                break;
            case 3568674:
                break;
            case 103668165:
                break;
            case 109526418:
                break;
            case 109648666:
                break;
            case 530542161:
                break;
            case 1094496948:
                break;
            case 1943291465:
                break;
        }
        String strZzi3 = SQLiteCommandFactory.UNDEFINED;
        String str72 = str5;
        String str82 = str4;
        switch (c) {
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
