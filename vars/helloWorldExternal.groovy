def call(Map config = [:]) {
  loadBatScript(name: 'hello_world.bat')
  echo "bat hellow_world.bat ${config.name} ${config.dayOfWeek}"
}
