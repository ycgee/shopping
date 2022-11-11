
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import ShippingManager from "./components/listers/ShippingCards"
import ShippingDetail from "./components/listers/ShippingDetail"

import StockManager from "./components/listers/StockCards"
import StockDetail from "./components/listers/StockDetail"


import StatusView from "./components/StatusView"
import StatusViewDetail from "./components/StatusViewDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/shippings',
                name: 'ShippingManager',
                component: ShippingManager
            },
            {
                path: '/shippings/:id',
                name: 'ShippingDetail',
                component: ShippingDetail
            },

            {
                path: '/stocks',
                name: 'StockManager',
                component: StockManager
            },
            {
                path: '/stocks/:id',
                name: 'StockDetail',
                component: StockDetail
            },


            {
                path: '/statuses',
                name: 'StatusView',
                component: StatusView
            },
            {
                path: '/statuses/:id',
                name: 'StatusViewDetail',
                component: StatusViewDetail
            },



    ]
})
