package com.vsu.amm.medframe.entity;

import javax.persistence.*;

@Entity
@Table(name = "MED_DEVICES")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEVICE_ID")
    private Long id;

    @Column(name = "SOUND_CARD_NAME")
    private String soundCardName;

    @Column(name = "HEADPHONE_NAME")
    private String headphoneName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSoundCardName() {
        return soundCardName;
    }

    public void setSoundCardName(String soundCardName) {
        this.soundCardName = soundCardName;
    }

    public String getHeadphoneNsme() {
        return headphoneName;
    }

    public void setHeadphoneNsme(String headphoneNsme) {
        this.headphoneName = headphoneNsme;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", soundCardName='" + soundCardName + '\'' +
                ", headphoneNsme='" + headphoneName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Device device = (Device) o;

        if (id != null ? !id.equals(device.id) : device.id != null) return false;
        if (soundCardName != null ? !soundCardName.equals(device.soundCardName) : device.soundCardName != null)
            return false;
        return headphoneName != null ? headphoneName.equals(device.headphoneName) : device.headphoneName == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (soundCardName != null ? soundCardName.hashCode() : 0);
        result = 31 * result + (headphoneName != null ? headphoneName.hashCode() : 0);
        return result;
    }
}
