# Clojurescript AWS serverless template

Template to build AWS serverless apps in clojurescript.
Lambdas are built using [shadow-cljs](http://shadow-cljs.org) and deployed with [serverless](https://serverless.com)

## Getting start

- For each lambda of your application copy the `lambda-template` folder and rename as you wish.
- Write your lambda in clojurescript and leave `main/handler` as entry point in `main.cljs`
- Add the lambda to `serverless.yml` and the folder name in the array `LAMBDAS` at L28
- Deploy with `serverless deploy`
