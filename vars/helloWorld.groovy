def call(Map config = [:]) {
  echo "hello ${config.name} today is ${config.dayOfWeek}"
}
