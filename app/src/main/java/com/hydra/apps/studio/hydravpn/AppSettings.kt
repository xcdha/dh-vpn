package com.hydra.apps.studio.hydravpn

class AppSettings {
    companion object {
        //this flag will be handled by subscription
        var isUserPaid = true

        // enable admob or facebook ads, by default admob ads are enable
        // set flags true or false
        val enableAdmobAds = true
        val enableFacebookAds = false

        //place your one signal id
        val oneSignalId = "7594c1c8-6ed4-4884-a672-859abb7c2e6c"

        //Subscription id's
        val one_month_subscription_id = "put your one month subscription id here"
        val three_month_subscription_id = "put your three months subscription id here"
        val one_year_subscription_id = "put your one year subscription id here"
    }
}