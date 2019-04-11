#!/bin/bash
# Copyright 2017 ZTE Corporation.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#         http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

logDir="/var/log/onap/vfc/gvnfmdriver/"
if [ ! -x  $logDir  ]; then
       mkdir -p $logDir
fi

# nohup python manage.py runserver 0.0.0.0:8484 > /dev/null &

if [ ${SSL_ENABLED} = "true" ]; then
    nohup uwsgi --https :8484,driver/pub/ssl/cert/foobar.crt,driver/pub/ssl/cert/foobar.key, -t 120 --module driver.wsgi --master --processes 4 &
else
    nohup uwsgi --http :8484 -t 120 --module driver.wsgi --master --processes 4 &
fi

while [ ! -f $logDir/runtime_gvnfmdriver.log ]; do
    sleep 1
done

tail -F  $logDir/runtime_gvnfmdriver.log
