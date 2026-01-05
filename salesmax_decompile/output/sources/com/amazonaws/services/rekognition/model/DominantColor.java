package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class DominantColor implements Serializable {
    private Integer blue;
    private String cSSColor;
    private Integer green;
    private String hexCode;
    private Float pixelPercent;
    private Integer red;
    private String simplifiedColor;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DominantColor)) {
            return false;
        }
        DominantColor dominantColor = (DominantColor) obj;
        if ((dominantColor.getRed() == null) ^ (getRed() == null)) {
            return false;
        }
        if (dominantColor.getRed() != null && !dominantColor.getRed().equals(getRed())) {
            return false;
        }
        if ((dominantColor.getBlue() == null) ^ (getBlue() == null)) {
            return false;
        }
        if (dominantColor.getBlue() != null && !dominantColor.getBlue().equals(getBlue())) {
            return false;
        }
        if ((dominantColor.getGreen() == null) ^ (getGreen() == null)) {
            return false;
        }
        if (dominantColor.getGreen() != null && !dominantColor.getGreen().equals(getGreen())) {
            return false;
        }
        if ((dominantColor.getHexCode() == null) ^ (getHexCode() == null)) {
            return false;
        }
        if (dominantColor.getHexCode() != null && !dominantColor.getHexCode().equals(getHexCode())) {
            return false;
        }
        if ((dominantColor.getCSSColor() == null) ^ (getCSSColor() == null)) {
            return false;
        }
        if (dominantColor.getCSSColor() != null && !dominantColor.getCSSColor().equals(getCSSColor())) {
            return false;
        }
        if ((dominantColor.getSimplifiedColor() == null) ^ (getSimplifiedColor() == null)) {
            return false;
        }
        if (dominantColor.getSimplifiedColor() != null && !dominantColor.getSimplifiedColor().equals(getSimplifiedColor())) {
            return false;
        }
        if ((dominantColor.getPixelPercent() == null) ^ (getPixelPercent() == null)) {
            return false;
        }
        return dominantColor.getPixelPercent() == null || dominantColor.getPixelPercent().equals(getPixelPercent());
    }

    public Integer getBlue() {
        return this.blue;
    }

    public String getCSSColor() {
        return this.cSSColor;
    }

    public Integer getGreen() {
        return this.green;
    }

    public String getHexCode() {
        return this.hexCode;
    }

    public Float getPixelPercent() {
        return this.pixelPercent;
    }

    public Integer getRed() {
        return this.red;
    }

    public String getSimplifiedColor() {
        return this.simplifiedColor;
    }

    public int hashCode() {
        return (((((((((((((getRed() == null ? 0 : getRed().hashCode()) + 31) * 31) + (getBlue() == null ? 0 : getBlue().hashCode())) * 31) + (getGreen() == null ? 0 : getGreen().hashCode())) * 31) + (getHexCode() == null ? 0 : getHexCode().hashCode())) * 31) + (getCSSColor() == null ? 0 : getCSSColor().hashCode())) * 31) + (getSimplifiedColor() == null ? 0 : getSimplifiedColor().hashCode())) * 31) + (getPixelPercent() != null ? getPixelPercent().hashCode() : 0);
    }

    public void setBlue(Integer num) {
        this.blue = num;
    }

    public void setCSSColor(String str) {
        this.cSSColor = str;
    }

    public void setGreen(Integer num) {
        this.green = num;
    }

    public void setHexCode(String str) {
        this.hexCode = str;
    }

    public void setPixelPercent(Float f) {
        this.pixelPercent = f;
    }

    public void setRed(Integer num) {
        this.red = num;
    }

    public void setSimplifiedColor(String str) {
        this.simplifiedColor = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRed() != null) {
            sb.append("Red: " + getRed() + ",");
        }
        if (getBlue() != null) {
            sb.append("Blue: " + getBlue() + ",");
        }
        if (getGreen() != null) {
            sb.append("Green: " + getGreen() + ",");
        }
        if (getHexCode() != null) {
            sb.append("HexCode: " + getHexCode() + ",");
        }
        if (getCSSColor() != null) {
            sb.append("CSSColor: " + getCSSColor() + ",");
        }
        if (getSimplifiedColor() != null) {
            sb.append("SimplifiedColor: " + getSimplifiedColor() + ",");
        }
        if (getPixelPercent() != null) {
            sb.append("PixelPercent: " + getPixelPercent());
        }
        sb.append("}");
        return sb.toString();
    }

    public DominantColor withBlue(Integer num) {
        this.blue = num;
        return this;
    }

    public DominantColor withCSSColor(String str) {
        this.cSSColor = str;
        return this;
    }

    public DominantColor withGreen(Integer num) {
        this.green = num;
        return this;
    }

    public DominantColor withHexCode(String str) {
        this.hexCode = str;
        return this;
    }

    public DominantColor withPixelPercent(Float f) {
        this.pixelPercent = f;
        return this;
    }

    public DominantColor withRed(Integer num) {
        this.red = num;
        return this;
    }

    public DominantColor withSimplifiedColor(String str) {
        this.simplifiedColor = str;
        return this;
    }
}
