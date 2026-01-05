package p001o;

import android.content.Context;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class jp6 {

    /* renamed from: e */
    public static final jp6[] f30900e = {new jp6("EUR", "Euro", "€", l7e.flag_eur), new jp6("USD", "United States Dollar", "$", l7e.flag_usd), new jp6("GBP", "British Pound", "£", l7e.flag_gbp), new jp6("CZK", "Czech Koruna", "Kč", l7e.flag_czk), new jp6("TRY", "Turkish Lira", "₺", l7e.flag_try), new jp6("AED", "Emirati Dirham", "د.إ", l7e.flag_aed), new jp6("AFN", "Afghanistan Afghani", "؋", l7e.flag_afn), new jp6("ARS", "Argentine Peso", "$", l7e.flag_ars), new jp6("AUD", "Australian Dollar", "$", l7e.flag_aud), new jp6("BBD", "Barbados Dollar", "$", l7e.flag_bbd), new jp6("BDT", "Bangladeshi Taka", " Tk", l7e.flag_bdt), new jp6("BGN", "Bulgarian Lev", "лв", l7e.flag_bgn), new jp6("BHD", "Bahraini Dinar", "BD", l7e.flag_bhd), new jp6("BMD", "Bermuda Dollar", "$", l7e.flag_bmd), new jp6("BND", "Brunei Darussalam Dollar", "$", l7e.flag_bnd), new jp6("BOB", "Bolivia Bolíviano", "$b", l7e.flag_bob), new jp6("BRL", "Brazil Real", "R$", l7e.flag_brl), new jp6("BTN", "Bhutanese Ngultrum", "Nu.", l7e.flag_btn), new jp6("BZD", "Belize Dollar", "BZ$", l7e.flag_bzd), new jp6("CAD", "Canada Dollar", "$", l7e.flag_cad), new jp6("CHF", "Switzerland Franc", "CHF", l7e.flag_chf), new jp6("CLP", "Chile Peso", "$", l7e.flag_clp), new jp6("CNY", "China Yuan Renminbi", "¥", l7e.flag_cny), new jp6("COP", "Colombia Peso", "$", l7e.flag_cop), new jp6("CRC", "Costa Rica Colon", "₡", l7e.flag_crc), new jp6("DKK", "Denmark Krone", "kr", l7e.flag_dkk), new jp6("DOP", "Dominican Republic Peso", "RD$", l7e.flag_dop), new jp6("EGP", "Egypt Pound", "£", l7e.flag_egp), new jp6("ETB", "Ethiopian Birr", "Br", l7e.flag_etb), new jp6("GEL", "Georgian Lari", "₾", l7e.flag_gel), new jp6("GHS", "Ghana Cedi", "¢", l7e.flag_ghs), new jp6("GMD", "Gambian dalasi", "D", l7e.flag_gmd), new jp6("GYD", "Guyana Dollar", "$", l7e.flag_gyd), new jp6("HKD", "Hong Kong Dollar", "$", l7e.flag_hkd), new jp6("HRK", "Croatia Kuna", "kn", l7e.flag_hrk), new jp6("HUF", "Hungary Forint", "Ft", l7e.flag_huf), new jp6("IDR", "Indonesia Rupiah", "Rp", l7e.flag_idr), new jp6("ILS", "Israel Shekel", "₪", l7e.flag_ils), new jp6("INR", "India Rupee", "0", l7e.flag_inr), new jp6("ISK", "Iceland Krona", "kr", l7e.flag_isk), new jp6("JMD", "Jamaica Dollar", "J$", l7e.flag_jmd), new jp6("JPY", "Japanese Yen", "¥", l7e.flag_jpy), new jp6("KES", "Kenyan Shilling", "KSh", l7e.flag_kes), new jp6("KRW", "Korea (South) Won", "₩", l7e.flag_krw), new jp6("KWD", "#N/A", "#N/A", l7e.flag_kwd), new jp6("KYD", "Cayman Islands Dollar", "$", l7e.flag_kyd), new jp6("KZT", "Kazakhstan Tenge", "лв", l7e.flag_kzt), new jp6("LAK", "Laos Kip", "₭", l7e.flag_lak), new jp6("LKR", "Sri Lanka Rupee", "₨", l7e.flag_lkr), new jp6("LRD", "Liberia Dollar", "$", l7e.flag_lrd), new jp6("LTL", "Lithuanian Litas", "Lt", l7e.flag_ltl), new jp6("MAD", "Moroccan Dirham", "MAD", l7e.flag_mad), new jp6("MDL", "Moldovan Leu", "MDL", l7e.flag_mdl), new jp6("MKD", "Macedonia Denar", "ден", l7e.flag_mkd), new jp6("MNT", "Mongolia Tughrik", "₮", l7e.flag_mnt), new jp6("MUR", "Mauritius Rupee", "₨", l7e.flag_mur), new jp6("MWK", "Malawian Kwacha", "MK", l7e.flag_mwk), new jp6("MXN", "Mexico Peso", "$", l7e.flag_mxn), new jp6("MYR", "Malaysia Ringgit", "RM", l7e.flag_myr), new jp6("MZN", "Mozambique Metical", "MT", l7e.flag_mzn), new jp6("NAD", "Namibia Dollar", "$", l7e.flag_nad), new jp6("NGN", "Nigeria Naira", "₦", l7e.flag_ngn), new jp6("NIO", "Nicaragua Cordoba", "C$", l7e.flag_nio), new jp6("NOK", "Norway Krone", "kr", l7e.flag_nok), new jp6("NPR", "Nepal Rupee", "₨", l7e.flag_npr), new jp6("NZD", "New Zealand Dollar", "$", l7e.flag_nzd), new jp6("OMR", "Oman Rial", "﷼", l7e.flag_omr), new jp6("PEN", "Peru Sol", "S/.", l7e.flag_pen), new jp6("PGK", "Papua New Guinean Kina", "K", l7e.flag_pgk), new jp6("PHP", "Philippines Peso", "₱", l7e.flag_php), new jp6("PKR", "Pakistan Rupee", "₨", l7e.flag_pkr), new jp6("PLN", "Poland Zloty", "zł", l7e.flag_pln), new jp6("PYG", "Paraguay Guarani", "Gs", l7e.flag_pyg), new jp6("QAR", "Qatar Riyal", "﷼", l7e.flag_qar), new jp6("RON", "Romania Leu", "lei", l7e.flag_ron), new jp6("RSD", "Serbia Dinar", "Дин.", l7e.flag_rsd), new jp6("RUB", "Russia Ruble", "₽", l7e.flag_rub), new jp6("SAR", "Saudi Arabia Riyal", "﷼", l7e.flag_sar), new jp6("SEK", "Sweden Krona", "kr", l7e.flag_sek), new jp6("SGD", "Singapore Dollar", "$", l7e.flag_sgd), new jp6("SOS", "Somalia Shilling", "S", l7e.flag_sos), new jp6("SRD", "Suriname Dollar", "$", l7e.flag_srd), new jp6("THB", "Thailand Baht", "฿", l7e.flag_thb), new jp6("TTD", "Trinidad and Tobago Dollar", "TT$", l7e.flag_ttd), new jp6("TWD", "Taiwan New Dollar", "NT$", l7e.flag_twd), new jp6("TZS", "Tanzanian Shilling", "TSh", l7e.flag_tzs), new jp6("UAH", "Ukraine Hryvnia", "₴", l7e.flag_uah), new jp6("UGX", "Ugandan Shilling", "USh", l7e.flag_ugx), new jp6("UYU", "Uruguay Peso", "$U", l7e.flag_uyu), new jp6("VEF", "Venezuela Bolívar", "Bs", l7e.flag_vef), new jp6("VND", "Viet Nam Dong", "₫", l7e.flag_vnd), new jp6("YER", "Yemen Rial", "﷼", l7e.flag_yer), new jp6("ZAR", "South Africa Rand", "R", l7e.flag_zar)};

    /* renamed from: f */
    public static List f30901f;

    /* renamed from: a */
    public String f30902a;

    /* renamed from: b */
    public String f30903b;

    /* renamed from: c */
    public String f30904c;

    /* renamed from: d */
    public int f30905d;

    public jp6(String str, String str2, String str3, int i) {
        this.f30902a = str;
        this.f30903b = str2;
        this.f30904c = str3;
        this.f30905d = i;
    }

    /* renamed from: a */
    public static List m34204a() {
        if (f30901f == null) {
            f30901f = Arrays.asList(f30900e);
        }
        return f30901f;
    }

    /* renamed from: c */
    public static jp6 m34205c(String str) {
        for (jp6 jp6Var : f30900e) {
            if (str.equals(jp6Var.m34206b())) {
                return jp6Var;
            }
        }
        return null;
    }

    /* renamed from: b */
    public String m34206b() {
        return this.f30902a;
    }

    /* renamed from: d */
    public int m34207d() {
        return this.f30905d;
    }

    /* renamed from: e */
    public String m34208e() {
        return this.f30903b;
    }

    /* renamed from: f */
    public String m34209f() {
        return this.f30904c;
    }

    /* renamed from: g */
    public void m34210g(Context context) {
        if (this.f30905d != -1) {
            return;
        }
        try {
            this.f30905d = context.getResources().getIdentifier("flag_" + this.f30902a.toLowerCase(), "drawable", context.getPackageName());
        } catch (Exception e) {
            e.printStackTrace();
            this.f30905d = -1;
        }
    }
}
