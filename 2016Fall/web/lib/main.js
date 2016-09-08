/**
 * Created by i073349 on 9/8/16.
 */
/*global _, $, Vue*/

$(function () {
    window.App = new Vue({
        el: '#app',
        template: '#app-tpl',
        methods: {
            doCheck: function(){
                alert(this.checkType);
            }
        },
        data: {
            checkType: '-1',
            opts: []
        },
        ready: function () {
            var resourceNames = ['SysProperty',
                'SysFile',
                'SysSocket',
                'SysDBConnection',
                'SysExit',
                'SysThread',
                'SysAWT',
                'SysClassloader',
                'SysListen'];
            var resourceType = 'JVM';
            var isSecure = true;
            this.opts = _.map(resourceNames, function (o) {
                return {
                    key: o,
                    label: o,
                    resourceName: o,
                    resourceType: 'JVM',
                    isSecure: true
                }
            });
        }
    })
})