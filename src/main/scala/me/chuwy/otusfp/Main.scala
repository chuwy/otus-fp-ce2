package me.chuwy.otusfp

import cats.effect.{IOApp, IO}

object Main extends IOApp.Simple {
  def run: IO[Unit] =
    IO.println("Hello World")
}
