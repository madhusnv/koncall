package org.bouncycastle.asn1.x500.style;

import com.sun.mail.imap.IMAPStore;
import java.util.Hashtable;
import mm.AbstractC4801l;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.i18n.MessageBundle;

/* loaded from: classes3.dex */
public class RFC4519Style extends AbstractX500NameStyle {
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier businessCategory;

    /* renamed from: c */
    public static final ASN1ObjectIdentifier f27521c;
    public static final ASN1ObjectIdentifier cn;

    /* renamed from: dc, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f44489dc;
    public static final ASN1ObjectIdentifier description;
    public static final ASN1ObjectIdentifier destinationIndicator;
    public static final ASN1ObjectIdentifier distinguishedName;
    public static final ASN1ObjectIdentifier dnQualifier;
    public static final ASN1ObjectIdentifier enhancedSearchGuide;
    public static final ASN1ObjectIdentifier facsimileTelephoneNumber;
    public static final ASN1ObjectIdentifier generationQualifier;
    public static final ASN1ObjectIdentifier givenName;
    public static final ASN1ObjectIdentifier houseIdentifier;
    public static final ASN1ObjectIdentifier initials;
    public static final ASN1ObjectIdentifier internationalISDNNumber;

    /* renamed from: l */
    public static final ASN1ObjectIdentifier f27522l;
    public static final ASN1ObjectIdentifier member;
    public static final ASN1ObjectIdentifier name;

    /* renamed from: o */
    public static final ASN1ObjectIdentifier f27523o;

    /* renamed from: ou, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f44490ou;
    public static final ASN1ObjectIdentifier owner;
    public static final ASN1ObjectIdentifier physicalDeliveryOfficeName;
    public static final ASN1ObjectIdentifier postOfficeBox;
    public static final ASN1ObjectIdentifier postalAddress;
    public static final ASN1ObjectIdentifier postalCode;
    public static final ASN1ObjectIdentifier preferredDeliveryMethod;
    public static final ASN1ObjectIdentifier registeredAddress;
    public static final ASN1ObjectIdentifier roleOccupant;
    public static final ASN1ObjectIdentifier searchGuide;
    public static final ASN1ObjectIdentifier seeAlso;
    public static final ASN1ObjectIdentifier serialNumber;

    /* renamed from: sn, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f44491sn;

    /* renamed from: st, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f44492st;
    public static final ASN1ObjectIdentifier street;
    public static final ASN1ObjectIdentifier telephoneNumber;
    public static final ASN1ObjectIdentifier teletexTerminalIdentifier;
    public static final ASN1ObjectIdentifier telexNumber;
    public static final ASN1ObjectIdentifier title;
    public static final ASN1ObjectIdentifier uid;
    public static final ASN1ObjectIdentifier uniqueMember;
    public static final ASN1ObjectIdentifier userPassword;
    public static final ASN1ObjectIdentifier x121Address;
    public static final ASN1ObjectIdentifier x500UniqueIdentifier;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t = AbstractC4801l.m9746t("2.5.4.15");
        businessCategory = aSN1ObjectIdentifierM9746t;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t2 = AbstractC4801l.m9746t("2.5.4.6");
        f27521c = aSN1ObjectIdentifierM9746t2;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t3 = AbstractC4801l.m9746t("2.5.4.3");
        cn = aSN1ObjectIdentifierM9746t3;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t4 = AbstractC4801l.m9746t("0.9.2342.19200300.100.1.25");
        f44489dc = aSN1ObjectIdentifierM9746t4;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t5 = AbstractC4801l.m9746t("2.5.4.13");
        description = aSN1ObjectIdentifierM9746t5;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t6 = AbstractC4801l.m9746t("2.5.4.27");
        destinationIndicator = aSN1ObjectIdentifierM9746t6;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t7 = AbstractC4801l.m9746t("2.5.4.49");
        distinguishedName = aSN1ObjectIdentifierM9746t7;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t8 = AbstractC4801l.m9746t("2.5.4.46");
        dnQualifier = aSN1ObjectIdentifierM9746t8;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t9 = AbstractC4801l.m9746t("2.5.4.47");
        enhancedSearchGuide = aSN1ObjectIdentifierM9746t9;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t10 = AbstractC4801l.m9746t("2.5.4.23");
        facsimileTelephoneNumber = aSN1ObjectIdentifierM9746t10;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t11 = AbstractC4801l.m9746t("2.5.4.44");
        generationQualifier = aSN1ObjectIdentifierM9746t11;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t12 = AbstractC4801l.m9746t("2.5.4.42");
        givenName = aSN1ObjectIdentifierM9746t12;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t13 = AbstractC4801l.m9746t("2.5.4.51");
        houseIdentifier = aSN1ObjectIdentifierM9746t13;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t14 = AbstractC4801l.m9746t("2.5.4.43");
        initials = aSN1ObjectIdentifierM9746t14;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t15 = AbstractC4801l.m9746t("2.5.4.25");
        internationalISDNNumber = aSN1ObjectIdentifierM9746t15;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t16 = AbstractC4801l.m9746t("2.5.4.7");
        f27522l = aSN1ObjectIdentifierM9746t16;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t17 = AbstractC4801l.m9746t("2.5.4.31");
        member = aSN1ObjectIdentifierM9746t17;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t18 = AbstractC4801l.m9746t("2.5.4.41");
        name = aSN1ObjectIdentifierM9746t18;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t19 = AbstractC4801l.m9746t("2.5.4.10");
        f27523o = aSN1ObjectIdentifierM9746t19;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t20 = AbstractC4801l.m9746t("2.5.4.11");
        f44490ou = aSN1ObjectIdentifierM9746t20;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t21 = AbstractC4801l.m9746t("2.5.4.32");
        owner = aSN1ObjectIdentifierM9746t21;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t22 = AbstractC4801l.m9746t("2.5.4.19");
        physicalDeliveryOfficeName = aSN1ObjectIdentifierM9746t22;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t23 = AbstractC4801l.m9746t("2.5.4.16");
        postalAddress = aSN1ObjectIdentifierM9746t23;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t24 = AbstractC4801l.m9746t("2.5.4.17");
        postalCode = aSN1ObjectIdentifierM9746t24;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t25 = AbstractC4801l.m9746t("2.5.4.18");
        postOfficeBox = aSN1ObjectIdentifierM9746t25;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t26 = AbstractC4801l.m9746t("2.5.4.28");
        preferredDeliveryMethod = aSN1ObjectIdentifierM9746t26;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t27 = AbstractC4801l.m9746t("2.5.4.26");
        registeredAddress = aSN1ObjectIdentifierM9746t27;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t28 = AbstractC4801l.m9746t("2.5.4.33");
        roleOccupant = aSN1ObjectIdentifierM9746t28;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t29 = AbstractC4801l.m9746t("2.5.4.14");
        searchGuide = aSN1ObjectIdentifierM9746t29;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t30 = AbstractC4801l.m9746t("2.5.4.34");
        seeAlso = aSN1ObjectIdentifierM9746t30;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t31 = AbstractC4801l.m9746t("2.5.4.5");
        serialNumber = aSN1ObjectIdentifierM9746t31;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t32 = AbstractC4801l.m9746t("2.5.4.4");
        f44491sn = aSN1ObjectIdentifierM9746t32;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t33 = AbstractC4801l.m9746t("2.5.4.8");
        f44492st = aSN1ObjectIdentifierM9746t33;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t34 = AbstractC4801l.m9746t("2.5.4.9");
        street = aSN1ObjectIdentifierM9746t34;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t35 = AbstractC4801l.m9746t("2.5.4.20");
        telephoneNumber = aSN1ObjectIdentifierM9746t35;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t36 = AbstractC4801l.m9746t("2.5.4.22");
        teletexTerminalIdentifier = aSN1ObjectIdentifierM9746t36;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t37 = AbstractC4801l.m9746t("2.5.4.21");
        telexNumber = aSN1ObjectIdentifierM9746t37;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t38 = AbstractC4801l.m9746t("2.5.4.12");
        title = aSN1ObjectIdentifierM9746t38;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t39 = AbstractC4801l.m9746t("0.9.2342.19200300.100.1.1");
        uid = aSN1ObjectIdentifierM9746t39;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t40 = AbstractC4801l.m9746t("2.5.4.50");
        uniqueMember = aSN1ObjectIdentifierM9746t40;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t41 = AbstractC4801l.m9746t("2.5.4.35");
        userPassword = aSN1ObjectIdentifierM9746t41;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t42 = AbstractC4801l.m9746t("2.5.4.24");
        x121Address = aSN1ObjectIdentifierM9746t42;
        ASN1ObjectIdentifier aSN1ObjectIdentifierM9746t43 = AbstractC4801l.m9746t("2.5.4.45");
        x500UniqueIdentifier = aSN1ObjectIdentifierM9746t43;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(aSN1ObjectIdentifierM9746t, "businessCategory");
        hashtable.put(aSN1ObjectIdentifierM9746t2, "c");
        hashtable.put(aSN1ObjectIdentifierM9746t3, "cn");
        hashtable.put(aSN1ObjectIdentifierM9746t4, "dc");
        hashtable.put(aSN1ObjectIdentifierM9746t5, "description");
        hashtable.put(aSN1ObjectIdentifierM9746t6, "destinationIndicator");
        hashtable.put(aSN1ObjectIdentifierM9746t7, "distinguishedName");
        hashtable.put(aSN1ObjectIdentifierM9746t8, "dnQualifier");
        hashtable.put(aSN1ObjectIdentifierM9746t9, "enhancedSearchGuide");
        hashtable.put(aSN1ObjectIdentifierM9746t10, "facsimileTelephoneNumber");
        hashtable.put(aSN1ObjectIdentifierM9746t11, "generationQualifier");
        hashtable.put(aSN1ObjectIdentifierM9746t12, "givenName");
        hashtable.put(aSN1ObjectIdentifierM9746t13, "houseIdentifier");
        hashtable.put(aSN1ObjectIdentifierM9746t14, "initials");
        hashtable.put(aSN1ObjectIdentifierM9746t15, "internationalISDNNumber");
        hashtable.put(aSN1ObjectIdentifierM9746t16, "l");
        hashtable.put(aSN1ObjectIdentifierM9746t17, "member");
        hashtable.put(aSN1ObjectIdentifierM9746t18, IMAPStore.ID_NAME);
        hashtable.put(aSN1ObjectIdentifierM9746t19, "o");
        hashtable.put(aSN1ObjectIdentifierM9746t20, "ou");
        hashtable.put(aSN1ObjectIdentifierM9746t21, "owner");
        hashtable.put(aSN1ObjectIdentifierM9746t22, "physicalDeliveryOfficeName");
        hashtable.put(aSN1ObjectIdentifierM9746t23, "postalAddress");
        hashtable.put(aSN1ObjectIdentifierM9746t24, "postalCode");
        hashtable.put(aSN1ObjectIdentifierM9746t25, "postOfficeBox");
        hashtable.put(aSN1ObjectIdentifierM9746t26, "preferredDeliveryMethod");
        hashtable.put(aSN1ObjectIdentifierM9746t27, "registeredAddress");
        hashtable.put(aSN1ObjectIdentifierM9746t28, "roleOccupant");
        hashtable.put(aSN1ObjectIdentifierM9746t29, "searchGuide");
        hashtable.put(aSN1ObjectIdentifierM9746t30, "seeAlso");
        hashtable.put(aSN1ObjectIdentifierM9746t31, "serialNumber");
        hashtable.put(aSN1ObjectIdentifierM9746t32, "sn");
        hashtable.put(aSN1ObjectIdentifierM9746t33, "st");
        hashtable.put(aSN1ObjectIdentifierM9746t34, "street");
        hashtable.put(aSN1ObjectIdentifierM9746t35, "telephoneNumber");
        hashtable.put(aSN1ObjectIdentifierM9746t36, "teletexTerminalIdentifier");
        hashtable.put(aSN1ObjectIdentifierM9746t37, "telexNumber");
        hashtable.put(aSN1ObjectIdentifierM9746t38, MessageBundle.TITLE_ENTRY);
        hashtable.put(aSN1ObjectIdentifierM9746t39, "uid");
        hashtable.put(aSN1ObjectIdentifierM9746t40, "uniqueMember");
        hashtable.put(aSN1ObjectIdentifierM9746t41, "userPassword");
        hashtable.put(aSN1ObjectIdentifierM9746t42, "x121Address");
        hashtable.put(aSN1ObjectIdentifierM9746t43, "x500UniqueIdentifier");
        hashtable2.put("businesscategory", aSN1ObjectIdentifierM9746t);
        hashtable2.put("c", aSN1ObjectIdentifierM9746t2);
        hashtable2.put("cn", aSN1ObjectIdentifierM9746t3);
        hashtable2.put("dc", aSN1ObjectIdentifierM9746t4);
        hashtable2.put("description", aSN1ObjectIdentifierM9746t5);
        hashtable2.put("destinationindicator", aSN1ObjectIdentifierM9746t6);
        hashtable2.put("distinguishedname", aSN1ObjectIdentifierM9746t7);
        hashtable2.put("dnqualifier", aSN1ObjectIdentifierM9746t8);
        hashtable2.put("enhancedsearchguide", aSN1ObjectIdentifierM9746t9);
        hashtable2.put("facsimiletelephonenumber", aSN1ObjectIdentifierM9746t10);
        hashtable2.put("generationqualifier", aSN1ObjectIdentifierM9746t11);
        hashtable2.put("givenname", aSN1ObjectIdentifierM9746t12);
        hashtable2.put("houseidentifier", aSN1ObjectIdentifierM9746t13);
        hashtable2.put("initials", aSN1ObjectIdentifierM9746t14);
        hashtable2.put("internationalisdnnumber", aSN1ObjectIdentifierM9746t15);
        hashtable2.put("l", aSN1ObjectIdentifierM9746t16);
        hashtable2.put("member", aSN1ObjectIdentifierM9746t17);
        hashtable2.put(IMAPStore.ID_NAME, aSN1ObjectIdentifierM9746t18);
        hashtable2.put("o", aSN1ObjectIdentifierM9746t19);
        hashtable2.put("ou", aSN1ObjectIdentifierM9746t20);
        hashtable2.put("owner", aSN1ObjectIdentifierM9746t21);
        hashtable2.put("physicaldeliveryofficename", aSN1ObjectIdentifierM9746t22);
        hashtable2.put("postaladdress", aSN1ObjectIdentifierM9746t23);
        hashtable2.put("postalcode", aSN1ObjectIdentifierM9746t24);
        hashtable2.put("postofficebox", aSN1ObjectIdentifierM9746t25);
        hashtable2.put("preferreddeliverymethod", aSN1ObjectIdentifierM9746t26);
        hashtable2.put("registeredaddress", aSN1ObjectIdentifierM9746t27);
        hashtable2.put("roleoccupant", aSN1ObjectIdentifierM9746t28);
        hashtable2.put("searchguide", aSN1ObjectIdentifierM9746t29);
        hashtable2.put("seealso", aSN1ObjectIdentifierM9746t30);
        hashtable2.put("serialnumber", aSN1ObjectIdentifierM9746t31);
        hashtable2.put("sn", aSN1ObjectIdentifierM9746t32);
        hashtable2.put("st", aSN1ObjectIdentifierM9746t33);
        hashtable2.put("street", aSN1ObjectIdentifierM9746t34);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifierM9746t35);
        hashtable2.put("teletexterminalidentifier", aSN1ObjectIdentifierM9746t36);
        hashtable2.put("telexnumber", aSN1ObjectIdentifierM9746t37);
        hashtable2.put(MessageBundle.TITLE_ENTRY, aSN1ObjectIdentifierM9746t38);
        hashtable2.put("uid", aSN1ObjectIdentifierM9746t39);
        hashtable2.put("uniquemember", aSN1ObjectIdentifierM9746t40);
        hashtable2.put("userpassword", aSN1ObjectIdentifierM9746t41);
        hashtable2.put("x121address", aSN1ObjectIdentifierM9746t42);
        hashtable2.put("x500uniqueidentifier", aSN1ObjectIdentifierM9746t43);
        INSTANCE = new RFC4519Style();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return aSN1ObjectIdentifier.equals((ASN1Primitive) f44489dc) ? new DERIA5String(str) : (aSN1ObjectIdentifier.equals((ASN1Primitive) f27521c) || aSN1ObjectIdentifier.equals((ASN1Primitive) serialNumber) || aSN1ObjectIdentifier.equals((ASN1Primitive) dnQualifier) || aSN1ObjectIdentifier.equals((ASN1Primitive) telephoneNumber)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        RDN[] rdnArrRDNsFromString = IETFUtils.rDNsFromString(str, this);
        RDN[] rdnArr = new RDN[rdnArrRDNsFromString.length];
        for (int i10 = 0; i10 != rdnArrRDNsFromString.length; i10++) {
            rdnArr[(r0 - i10) - 1] = rdnArrRDNsFromString[i10];
        }
        return rdnArr;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String[] oidToAttrNames(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String oidToDisplayName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) this.defaultSymbols.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) {
        StringBuffer stringBuffer = new StringBuffer();
        RDN[] rDNs = x500Name.getRDNs();
        boolean z6 = true;
        for (int length = rDNs.length - 1; length >= 0; length--) {
            if (z6) {
                z6 = false;
            } else {
                stringBuffer.append(',');
            }
            IETFUtils.appendRDN(stringBuffer, rDNs[length], this.defaultSymbols);
        }
        return stringBuffer.toString();
    }
}
