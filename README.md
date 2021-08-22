# Settings Manager
The Android application for managing WI-FI settings

## Commands via adb:

### To enable wifi:
`adb shell 'am start -n "com.settingsmanager/com.settingsmanager.WifiSettingsManagerActivity" --esn enableWifi'`

### To disable wifi:
`adb shell 'am start -n "com.settingsmanager/com.settingsmanager.WifiSettingsManagerActivity" --esn disableWifi'`

### To connect to saved wifi network:
`adb shell 'am start -n "com.settingsmanager/com.settingsmanager.WifiSettingsManagerActivity" --esn connect -e ssid "MyNetwork"'`

### To connect to new wifi network:
`adb shell 'am start -n "com.settingsmanager/com.settingsmanager.WifiSettingsManagerActivity" --esn newConnection -e ssid "MyNewNetwork" -e password "MyPassword" -e networkType "<wep/wpa/open>"'`
